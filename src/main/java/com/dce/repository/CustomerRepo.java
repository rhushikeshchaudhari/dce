package com.dce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dce.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

	Customer findByAccountNo(Long accountNo);

}
