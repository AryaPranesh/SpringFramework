package Patient;

import org.springframework.stereotype.Component;

@Component
public class BP implements Disease {
	
	public void process() {
		
		System.out.println("Patient can be treated for Blood Pressure");
	}

}