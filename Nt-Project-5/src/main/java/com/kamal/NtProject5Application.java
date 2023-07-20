package com.kamal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kamal.beans.BillGenerator;

@SpringBootApplication
public class NtProject5Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(NtProject5Application.class, args);
		BillGenerator generator=ctx.getBean("bill",BillGenerator.class);
		System.out.println("data:: "+generator);
		((ConfigurableApplicationContext) ctx).close();
	}
}
