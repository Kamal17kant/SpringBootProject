package com.kamal.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	private Integer srNo;
	private String eName;
	private String job;
	private double sal;
	private Integer deptNo;
	private Integer mgrNo;

}
