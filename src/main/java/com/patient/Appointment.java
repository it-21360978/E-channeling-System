package com.patient;

public class Appointment {
	
	
	private int id;
	private String name;
	private String address;
	private int age;
	private String medcenter;
	private String Dname;
	private String specs;
	private String Appdate;
	private String Apptime;
	
	
	public Appointment(int id, String name, String address, int age, String medcenter, String Dname, String specs,
			String Appdate, String Apptime) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.medcenter = medcenter;
		this.Dname = Dname;
		this.specs = specs;
		this.Appdate = Appdate;
		this.Apptime = Apptime;
	}




	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public int getAge() {
		return age;
	}


	public String getMedcenter() {
		return medcenter;
	}


	public String getDname() {
		return Dname;
	}


	public String getSpecs() {
		return specs;
	}


	public String getAppdate() {
		return Appdate;
	}


	public String getApptime() {
		return Apptime;
	}
	

}
