package com.boa.crs.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.crs.app.entity.PaymentDetailsEntity;
import com.boa.crs.app.repo.PaymentDetailsRepository;


public class PaymentServiceImpl implements PaymentService {

	
	// You need to take only debit card / credit / UI Details 
	// based on Payment selction calculate the payment // generate TX id 
	// Store in DB
	
	@Autowired
	PaymentDetailsRepository PaymentRepository;

	@Override
	public void addPayment(PaymentDetailsEntity Payment) {
		PaymentRepository.save(Payment);
		
	}

	@Override
	public void updatePayment(PaymentDetailsEntity paymentDetailsEntity) {
		PaymentDetailsEntity PaymentExists = PaymentRepository.findById(paymentDetailsEntity.getTransactionId()).get();
		if(null != PaymentExists) {
			PaymentRepository.save(paymentDetailsEntity);
		}
		
	}

	@Override
	public void removePayment(Long PaymentId) {
		PaymentDetailsEntity PaymentExists = PaymentRepository.findById(PaymentId).get();
		if(null != PaymentExists) {
			PaymentRepository.deleteById(PaymentId);
		}
		
	}

	@Override
	public PaymentDetailsEntity getTransactionDetails(Long transactionId) {
		// TODO Auto-generated method stub
	
		return PaymentRepository.findById(transactionId).get();
	}
}
