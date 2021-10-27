package Hospital;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestHospitalPro {


	public static void main(String[] args) {
	    AnnotationConfigApplicationContext hos = new AnnotationConfigApplicationContext();
	    hos.register(HospitalConfig.class);
	    hos.refresh();
	    Hospital h1 = hos.getBean(Hospital.class);
	    System.out.println("Hospital name:" + h1.getHospitalName());
	    hos.close();
	}
} 