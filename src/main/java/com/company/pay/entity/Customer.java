package com.company.pay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "ADDRESS")
	private String customerAddress;
	
	@Column(name = "MOBILE_NUMBER")
	private String customerMobileNum;
	
	@Column(name = "EMAIL")
	private String customerEmailId;
		
	@Column(name = "PASS")
	private String pass;

	
	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getCustomerMobileNum() {
		return customerMobileNum;
	}


	public void setCustomerMobileNum(String customerMobileNum) {
		this.customerMobileNum = customerMobileNum;
	}


	public String getCustomerEmailId() {
		return customerEmailId;
	}


	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	
}
