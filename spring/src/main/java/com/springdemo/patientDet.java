package com.springdemo;

public class patientDet {

  
          private int id;  
          private String name; 
          private String disease;
  
           public patientDet() {
        	   System.out.println("def cons");
        	}  
  
           public patientDet(int id) {
        	   this.id= id;
        	   
        	}  
  
           public patientDet(String name) { 
        	   this.name = name;
        	}  
             
  
           public patientDet(int id, String name,String disease) {  
               this.id = id;  
               this.name = name;
               this.disease=disease;
            } 
           public String diPrint(){  
               return  disease;
               
            }  
           
           public String namePrint(){  
               return  name;
               
            }  
           void show(){
        	   String s=namePrint();
        	   String d=diPrint();
               System.out.println("PATIENT ID   : "+id+" PATIENT NAME    : "+s+"  DIAGONISED WITH : "+d);  
            }  
  
}  