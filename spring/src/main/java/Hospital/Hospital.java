package Hospital;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Hospital {
	private String HospitalName;
	public Hospital(String HospitalName) {
		this.HospitalName = HospitalName;
	}
	@PostConstruct
	public void springPostConstruct() {
	     System.out.println("Iniatialise");
	     if(HospitalName != null) {
	    	 System.out.println("HospitalName property is created:"+ HospitalName);
	     }
	}	
	public String getHospitalName() {
		return HospitalName;
	}
	@PreDestroy
	public void springPreDestroy() {
		System.out.println("Release resources ");
	}
} 