package com.springdemo;

import java.util.Iterator;
import java.util.List;

public class forListSet {
	  
	private List<String> adviceToPatient;

	public List<String> getAdviceToPatient() {
		return adviceToPatient;
	}

	public void setAdviceToPatient(List<String> adviceToPatient) {
		this.adviceToPatient = adviceToPatient;
	} 
	
	public void displayAdvice(){  
	      
	    System.out.println("ADVICE TO PATIENT:");  
	    Iterator<String> itr=adviceToPatient.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	
}
