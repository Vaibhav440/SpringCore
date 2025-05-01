package com.nt.comps;

public class Student extends Person {
	private  int  studId;
	private  String course;

	public Student(String name, String addrs, AadharDetails aadhar, int studId,  String course) {
		super(name, addrs, aadhar);
		System.out.println("Student:: 5-param consructor");
		this.studId=studId;
		this.course=course;
		
	}

	@Override
	public String toString() {
		return "Student [studid=" + studId + ", course=" + course + "]--"+super.toString();
	}
	
	

}
