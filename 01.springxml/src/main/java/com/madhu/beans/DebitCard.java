package com.madhu.beans;

public class DebitCard implements IPay {

	public boolean makePayment(Double amt) {
		System.out.println("Making payment through DebitCard and bill is:"+amt);
		return true;
	}
	public DebitCard() {
		System.out.println("debit Card object is created  by IOC...");
	}
}
