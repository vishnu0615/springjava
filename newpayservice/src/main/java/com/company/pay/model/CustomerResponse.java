package com.company.pay.model;

import java.io.Serializable;




public class CustomerResponse implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private CustomerRequestDTO customer;
	
	public CustomerRequestDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerRequestDTO customer) {
		this.customer = customer;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	private String errorCode;
	
	private String errorMessage;
	
	private int totalCount;

}
