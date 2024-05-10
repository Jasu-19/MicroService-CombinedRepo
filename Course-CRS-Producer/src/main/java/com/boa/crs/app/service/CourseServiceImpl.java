package com.boa.crs.app.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.boa.crs.app.entity.CourseEntity;
import com.boa.crs.app.model.CourseDetails;
import com.boa.crs.app.model.PaymentDetails;
import com.boa.crs.app.repo.CourseRepository;

public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${payment.url}")
	String paymentUrl;
	

	@Override
	public ResponseEntity<String> addCourse(CourseDetails course,PaymentDetails paymentDetails) {
		CourseEntity newEntity = new CourseEntity();
		BeanUtils.copyProperties(course, newEntity);
		newEntity.setStartDate(Date.valueOf(LocalDate.now()));
//		newEntity.setAmount(50000);
		courseRepository.save(newEntity);
		return performPaymentOperation(newEntity,paymentDetails);
	}
	
	private ResponseEntity<String> performPaymentOperation(CourseEntity course, PaymentDetails paymentDetails) {
	return	restTemplate.exchange(paymentUrl, HttpMethod.POST, getHttpEntity(paymentDetails), String.class);
	}

	private HttpEntity<PaymentDetails> getHttpEntity(PaymentDetails paymentDetails) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<PaymentDetails> entity = new HttpEntity<PaymentDetails>(paymentDetails, headers);
		return entity;
	}

	@Override
	public List<CourseEntity> getAllCourse() {
		return courseRepository.findAll();
	}

	@Override
	public void updateCourse(Long courseId, CourseEntity course) {
		CourseEntity courseExists = courseRepository.findById(courseId).get();
		if(null != courseExists) {
			courseRepository.save(course);
		}
		
	}

	@Override
	public void removeCourse(Long courseId) {
		CourseEntity courseExists = courseRepository.findById(courseId).get();
		if(null != courseExists) {
			courseRepository.deleteById(courseId);
		}
		
	}

	//Admin Course operation 
	// Student Course Operation 
	
}
