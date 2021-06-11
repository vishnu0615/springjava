package com.company.pay.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.pay.entity.Customer;
import com.company.pay.model.CustomerRequestDTO;
import com.company.pay.model.CustomerResponse;
import com.company.pay.repository.PayRepository;

@Service
public class PayService  {

	@Autowired
	PayRepository payRepository;

	public CustomerResponse saveCustomerDetails(CustomerRequestDTO customerRequest) {
		CustomerResponse customerResponse = new CustomerResponse();
		Customer customerEntity = new Customer();
		BeanUtils.copyProperties(customerRequest, customerEntity);
		payRepository.save(customerEntity);
		customerResponse.setErrorCode("00");
		customerResponse.setErrorMessage("success");
		return customerResponse;
	}

}
