  package com.company.pay.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.pay.model.CustomerRequestDTO;
import com.company.pay.model.CustomerResponse;

@RestController
public class PayRestController {

	@PostMapping("/saveCustomer")
	public CustomerResponse saveCustomer(@RequestBody CustomerRequestDTO customerRequest) {
		CustomerResponse customerResponse = new CustomerResponse();
		customerResponse.setCustomer(customerRequest);
		customerResponse.setErrorCode("00");
		customerResponse.setErrorMessage("Success");
		customerResponse.setTotalCount(1);
		return customerResponse;
	}
	
	
	@PostMapping("/saveCustomerNew")
	public String saveCustomer2(@RequestBody CustomerRequestDTO customerRequest) {
		return "Successfully";
	}
}
