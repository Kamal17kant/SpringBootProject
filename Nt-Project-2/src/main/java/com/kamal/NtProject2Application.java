package com.kamal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.kamal.beans.Student;

@SpringBootApplication
@ImportResource("com/kamal/cfgs/applicationContext.xml")
public class NtProject2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(NtProject2Application.class, args);
		Student st=context.getBean("std",Student.class);
		st.prepration("CTS-Interview");
		((ConfigurableApplicationContext)context).close();
	}

}
