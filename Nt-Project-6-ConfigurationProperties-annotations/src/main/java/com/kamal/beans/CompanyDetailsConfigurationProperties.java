package com.kamal.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cmpg")
@ConfigurationProperties(prefix = "org.kamal")
@Data
public class CompanyDetailsConfigurationProperties {
	
	private String name;
	private String type;
	private String location;	
}
