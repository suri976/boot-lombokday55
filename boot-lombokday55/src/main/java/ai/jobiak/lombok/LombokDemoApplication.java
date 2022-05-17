package ai.jobiak.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.jobiak.lombok.model.Customer;

@SpringBootApplication
public class LombokDemoApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run( LombokDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer cust = new Customer();
//		cust.setCustId(1);
//		cust.setName("John Deo");
//		cust.setBalance(2000);
		
		Customer cust2 = new Customer(1,"ramu",2000);
		System.out.println(cust2.getBalance());
		System.out.println(cust2.getCustId());
		System.out.println(cust2.getName());
		

	
	}

	
	
	
	
}
