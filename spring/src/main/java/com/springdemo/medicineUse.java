package com.springdemo;

public class medicineUse {
    private setConsDI medDose;

	public setConsDI getMedDose() {
		return medDose;
	}

	public void setMedDose(setConsDI medDose) {
		this.medDose = medDose;
	}
    
	
	void displayInfo(){  
	   
	    System.out.println("PRESCRIBED MEDICINE  :   "+medDose); 
}
}