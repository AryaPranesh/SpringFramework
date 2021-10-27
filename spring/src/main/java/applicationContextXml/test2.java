package applicationContextXml;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class test2 {
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("pat2.xml");  
	    patient2 p=(patient2)context.getBean("a");  
	    p.msg(); 
	    ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
        cxt.close();
	
	}
}