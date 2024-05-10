package com.boa.crs.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.crs.app.entity.PaymentDetailsEntity;



@Repository
public interface PaymentDetailsRepository extends JpaRepository<PaymentDetailsEntity, Long>{
		
}
