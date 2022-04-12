package dealership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dealership.beans.Employee;
import dealership.reposittory.VehicleRepository;
import dmacc.model.Student;




@SpringBootApplication
public class DealershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealershipApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(DealershipApplication.class);
		Employee e = appContext.getBean("employee", Employee.class);
		System.out.println(e.toString());
	}
	
	@Autowired
	VehicleRepository repo;
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(DealershipApplication.class);
		
		//Using an existing bean
				Employee e = appContext.getBean("employee", Employee.class);
				e.setName("Roman");
				repo.save(e);
				
		
		
		
		
//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	}
	

}
