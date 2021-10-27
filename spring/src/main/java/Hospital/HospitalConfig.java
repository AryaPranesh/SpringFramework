package Hospital;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class HospitalConfig {
    @Bean	
	public Hospital hospital(){
		return new Hospital("RVEES GROUP OF HOSPITALS");
	}
} 