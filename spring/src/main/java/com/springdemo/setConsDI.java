package com.springdemo;

public class setConsDI {
	private String medicine;
	private String dosage;
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	
	public String toString(){  
	    return " "+medicine+" "+dosage;  
}}
