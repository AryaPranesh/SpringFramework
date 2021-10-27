package Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Doctor {
	
	@Autowired
	@Qualifier("diabetes")     
	Disease di;
	
	
	public Disease getDisease() {
		return di;
	}
	public void setDisease(Disease di) {
		this.di = di;
	}
	public void quali() {
		System.out.println("Will be able to treat Diabetes and BP");
		di.process();
	}

}
