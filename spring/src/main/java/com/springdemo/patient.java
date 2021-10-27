package com.springdemo;

public class patient {
	private int age;  
	private String name;  
	private addressPat address; 
	  
	public  patient() {System.out.println("def cons");}  
	  
	public  patient(int age, String name, addressPat address) {  
	    super();  
	    this.age = age;  
	    this.name = name;  
	    this.address = address;  
	}  
	 void display() {
		 System.out.println("*************PATIENT RECORD***************");
	 } 
	void show(){  
		
	    System.out.println("PATIENT AGE    : "+age+" "+"\n"+"PATIENT NAME   : "+name); 
	    System.out.println("ADDRESS	 :");
	    System.out.println(address.addressPrint());  
	}  
	  
	}  

