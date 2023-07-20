package com.kamal.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kamal.dao.UserRepository;
import com.kamal.entity.User;

@SpringBootApplication
public class Proj3BootJpaExmpleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Proj3BootJpaExmpleApplication.class, args);
		UserRepository urepo=context.getBean(UserRepository.class);
		User user=new User();
		user.setName("kamal");
		user.setCity("gaya");
		user.setStatus(" i am java programmer");
	
	}

}
