package com.boa.crs.app.model;

import java.sql.Date;

public class CourseDetails {
	

	private Long id;
	
	private String name;
	
	private int enrolledstudentNumber;
	
	private Date startDate;
	private Date endDate;
	
	private Date createdDate;
	
//	@Column(name= "COURSE_DETAILS")
//	private String courseDetails;
	
	
//	@Column(name = "COURSE_AMOUNT")
//	private int Amount;
	
	private PaymentDetails paymentDetails;
	
	


	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}


	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}


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
