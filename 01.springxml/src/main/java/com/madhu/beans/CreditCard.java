package com.madhu.beans;

public class CreditCard implements IPay {

	public boolean makePayment(Double amt) {
		System.out.println("Making payment through CreditCard and bill is:"+amt);
		return true;
	}
	public CreditCard() {
		System.out.println("Credit Card object is created  by IOC...");
	}

}
