//AadharDetails.java  (Dependent class)
package com.nt.comps;

public class AadharDetails {

	private long aadharNo;
	private int age;
	private long mobileNo;

	// alt+shift+s, o (To get parameterized constructor)
	public AadharDetails(long aadharNo, int age, long mobileNo) {
		System.out.println("AadharDetails.AadharDetails()");
		this.aadharNo = aadharNo;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	// alt+shift+s,s (To get toString())
	@Override
	public String toString() {
		return "AadharDetails [aadharNo=" + aadharNo + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
