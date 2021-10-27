package com.springdemo;


import org.springframework.beans.factory.BeanFactory;  

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class testDemo { 
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("demo.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    welcomeSpring welcome=(welcomeSpring)factory.getBean("welcome");//-------------->WELCOME DEMO
    welcome.displayInfo(); 
    
    //<-------------------------------------------CONSTRUCTION INJECTION--------------------------------------------------------------->
    
    
    patientDet p1=(patientDet)factory.getBean("patient");           //-------------->FOR PRIMITIVE AND STRING BASED[CI]
    p1.show();  
    
    patient p2=(patient)factory.getBean("p");                       //-------------->FOR CONSTRUCTION INJECTION ON DEPENDENCY OBJECT[CI]
    p2.display();
    p2.show();  
    
    forList fd=(forList)factory.getBean("d");                       //-------------->FOR COLLECTION BASED[CI]
    fd.displayInfo(); 
    
  //<---------------------------------------------SETTER  INJECTION-------------------------------------------------------------------->
    
    setPatPri set=(setPatPri)factory.getBean("set");               //--------------->FOR PRIMITIVE AND STRING BASED[SI]
    set.display();  
    
    medicineUse me=(medicineUse)factory.getBean("meduse");        //---------------->FOR SETTER INJECTION ON DEPENDENCY OBJECT[SI]
    me.displayInfo();  

    forListSet liset=( forListSet)factory.getBean("advice");      //---------------->FOR COLLECTION BASED [SI]
    liset.displayAdvice();
    
      
}  
}  