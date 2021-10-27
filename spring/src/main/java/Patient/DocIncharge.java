package Patient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DocIncharge {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(doctorConfig.class);
		
		Doctor doc = factory.getBean(Doctor.class);
		doc.quali();
	}
	
	
}