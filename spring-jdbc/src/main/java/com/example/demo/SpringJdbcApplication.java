package com.example.demo;
import com.example.demo.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;
import com.example.demo.model.Customer;
import com.example.demo.model.Customer;
@SpringBootApplication
public class SpringJdbcApplication {
    
	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
	        int key =2;
	        CustomerService service = ctx.getBean(CustomerService.class);
	        if(key ==1) {
	        Customer obj = ctx.getBean(Customer.class);
	                obj.setCustomerId(Integer.parseInt(args[1]));
	                obj.setCustomerName(args[2]);
	                obj.setEmail(args[3]);
	                
	                //CustomerService service = ctx.getBean(CustomerService.class);
	                System.out.println("Is Added :="+ service.save(obj));}
	                if(key==2) {
	                    service.findAll().forEach(System.out::println);
	                }
	                ctx.close();
		
	}
	

}
