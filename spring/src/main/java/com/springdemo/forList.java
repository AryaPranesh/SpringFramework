package com.springdemo;
import java.util.Iterator;  
import java.util.List;  
  
public class forList {
 
private String diCode;  
private String diName;  
private List<String> description;  
  
public forList() {}  
public forList(String diCode, String diName, List<String> description) {  
    super();  
    this.diCode = diCode;  
    this.diName = diName;  
    this.description= description;  
}  
  
public void displayInfo(){  
    System.out.println("DISEASE CODE       :  "+diCode);
    System.out.println("DISEASE NAME       :  "+diName);
    System.out.println("DISEASE DESCRIPTION:  ");  
    Iterator<String> des=description.iterator();  
    while(des.hasNext()){  
        System.out.println(des.next());  
    }  
}  
  
}  