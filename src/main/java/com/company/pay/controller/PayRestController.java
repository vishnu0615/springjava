package com.company.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.pay.model.CustomerRequestDTO;
import com.company.pay.model.CustomerResponse;
import com.company.pay.service.impl.PayService;

@RestController
@RequestMapping("/customer")
public class PayRestController {

	@Autowired
	PayService payService;

	@PostMapping("/saveCustomer")
	public CustomerResponse saveCustomer(@RequestBody CustomerRequestDTO customerRequest) {

		return payService.saveCustomerDetails(customerRequest);

	}

}
