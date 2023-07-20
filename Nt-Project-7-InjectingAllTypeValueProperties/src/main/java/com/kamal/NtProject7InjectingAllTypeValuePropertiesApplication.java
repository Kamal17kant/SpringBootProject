package com.kamal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kamal.modal.Employee;

@SpringBootApplication
public class NtProject7InjectingAllTypeValuePropertiesApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(NtProject7InjectingAllTypeValuePropertiesApplication.class, args);
	Employee emp=ctx.getBean("emp",Employee.class);
	System.out.println(emp);
	}

}
