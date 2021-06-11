package com.company.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.pay.entity.Customer;

public interface PayRepository extends JpaRepository<Customer, Long>{

}
