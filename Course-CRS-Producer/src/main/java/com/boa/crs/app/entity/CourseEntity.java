package com.boa.crs.app.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Transient;

import com.boa.crs.app.model.PaymentDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_details")
public class CourseEntity {
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name="COURSE_NAME")
	private String name;
	
	@Column(name="TOTAL_STUDENTS")
	private int enrolledstudentNumber;
	
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	
	@CreationTimestamp
	@Column(name="CREATED_DATA")
	private Date createdDate;
	
//	@Column(name= "COURSE_DETAILS")
//	private String courseDetails;
	
	
//	@Column(name = "COURSE_AMOUNT")
//	private int Amount;
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEnrolledstudentNumber() {
		return enrolledstudentNumber;
	}


	public void setEnrolledstudentNumber(int enrolledstudentNumber) {
		this.enrolledstudentNumber = enrolledstudentNumber;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


//	public String getCourseDetails() {
//		return courseDetails;
//	}
//
//
//	public void setCourseDetails(String courseDetails) {
//		this.courseDetails = courseDetails;
//	}
//
//
//	public int getAmount() {
//		return Amount;
//	}
//
//
//	public void setAmount(int amount) {
//		Amount = amount;
//	}
	
	

	
	

}
