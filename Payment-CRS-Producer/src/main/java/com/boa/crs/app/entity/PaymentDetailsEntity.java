package com.boa.crs.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment_details")
public class PaymentDetailsEntity {
	@Id
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="PAYMENT_STATUS")
	private String paymentStatus;
	
	@Column(name="PAYMENT_TYPE")
	private String paymentType;
	
	@Column(name="PAYMENT_AMOUNT")
	private Long paymentAmount;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="COURSE_ID")
	private int courseId;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Long getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
}

