package com.nt.comps;

public class Customer extends Person {
	private  double billAmt;
	private  String txId;

	public Customer(String name, String addrs, AadharDetails aadhar, double billAmt,  String txId) {
		super(name, addrs, aadhar);
		System.out.println("Customer:: 5-param consructor");
		this.billAmt=billAmt;
		this.txId=txId;
		
	}

	@Override
	public String toString() {
		return "Customer [billAmt=" + billAmt + ", txId=" + txId + "]--->"+super.toString();
	}
	
	

}
