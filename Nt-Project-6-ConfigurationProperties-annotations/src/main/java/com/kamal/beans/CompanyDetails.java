package com.kamal.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("comp")
public class CompanyDetails {
	@Value("${org.kamal.name}")
	private String name;
	@Value("${org.kamal.type}")
	private String type;
	@Value("${org.kamal.location}")
	private String location;
	
	@Override
	public String toString() {
		return "CompanyDetails [name=" + name + ", type=" + type + ", location=" + location + "]";
	}
	

}
