package com.patient;

public class Medicine {
	
	
	int id ;
	String patient;
	int age;
	String drug;
	String address;
	
	
	public Medicine(int id, String patient, int age, String drug, String address) {
		super();
		this.id = id;
		this.patient = patient;
		this.age = age;
		this.drug = drug;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public String getPatient() {
		return patient;
	}


	public int getAge() {
		return age;
	}


	public String getDrug() {
		return drug;
	}


	public String getAddress() {
		return address;
	}


	

}
