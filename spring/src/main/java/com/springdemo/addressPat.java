package com.springdemo;

public class addressPat {

	          private String WardName;
              private String city;  
              private String state;  
              private String country; 
              private int pin;
  
              public addressPat(String WardName,String city, String state, String country,int pin) {  
              super(); 
              this.WardName=WardName;
              this.city = city;  
              this.state = state;  
              this.country = country; 
              this.pin=pin;
              }  
  
              public String addressPrint(){  
                 return WardName+"\n"+city+"\n"+state+"\n"+country+"\n"+pin;  
              }  
  }  