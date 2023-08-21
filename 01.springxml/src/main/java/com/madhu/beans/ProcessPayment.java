package com.madhu.beans;

public class ProcessPayment {

	private IPay ipay;
	public ProcessPayment() {
		
		System.out.println("ProcessPayment object is created by IOC..");
	}
	
	

	public void setIpay(IPay ipay) {
		this.ipay = ipay;
	}

	public void billPayment(Double amt) {
		boolean status=ipay.makePayment(amt);
		if(status) {
			System.out.println("Payment success!!");
		}else {
			System.out.println("Payment declined!!");
		}
		
	}
}
