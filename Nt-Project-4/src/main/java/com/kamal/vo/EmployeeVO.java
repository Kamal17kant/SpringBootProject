package com.kamal.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeVO implements Serializable {
	private String srNo;
	private String eName;
	private String job;
	private String sal;
	private String deptNo;
	private String mgrNo;

}
