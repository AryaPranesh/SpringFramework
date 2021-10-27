package com.springdemo;

public class setPatPri {

 
private int RoomNo;  
private String wardName;  
private String docOnDuty;  
  
public int getRoomNo() {  
    return RoomNo;  
}  
public void setRoomNo(int RoomNo) {  
    this.RoomNo = RoomNo;  
}  
public String getwardName() {  
    return wardName;  
}  
public void setwardName(String wardName) {  
    this.wardName = wardName;  
}  
  
public String getdocOnDuty() {  
    return docOnDuty;  
}  
public void setdocOnDuty(String docOnDuty) {  
    this.docOnDuty = docOnDuty;  
}  
void display(){
	System.out.println("ROOM NUMBER         :   "+RoomNo);
	System.out.println("WARD NAME           :   "+wardName);
	System.out.println("DUTY DOCTOR         :   "+docOnDuty);
      
}  
  
}  