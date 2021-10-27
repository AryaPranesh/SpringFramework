package Patient;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Diabetes implements Disease {
	
	public void process() {
		
		System.out.println(" Patient can be treated for diabetes");
		
	}

}

