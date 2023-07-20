package com.kamal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kamal.beans.CompanyDetails;
import com.kamal.beans.CompanyDetailsConfigurationProperties;

@SpringBootApplication
public class NtProject6ConfigurationPropertiesAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(NtProject6ConfigurationPropertiesAnnotationsApplication.class, args);
		CompanyDetails cpm= ctx.getBean("comp",CompanyDetails.class);
		System.out.println(cpm.toString());
		CompanyDetailsConfigurationProperties cpcfgs=ctx.getBean("cmpg",CompanyDetailsConfigurationProperties.class);
		System.out.println(cpcfgs.toString());
	}

}
