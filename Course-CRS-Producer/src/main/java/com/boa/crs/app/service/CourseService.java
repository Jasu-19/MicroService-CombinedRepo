package com.boa.crs.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.boa.crs.app.entity.CourseEntity;
import com.boa.crs.app.model.CourseDetails;
import com.boa.crs.app.model.PaymentDetails;

public interface CourseService {
	
	public ResponseEntity<String> addCourse(CourseDetails course , PaymentDetails paymentDetails);
	public void updateCourse(Long courseId, CourseEntity course);
	public void removeCourse(Long courseId);
	List<CourseEntity> getAllCourse();
	
}
