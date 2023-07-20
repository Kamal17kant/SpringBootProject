package com.kamal.dao;

import java.util.List;

import com.kamal.bo.EmployeeBO;

public interface IEmployeeDAO {
	public List<EmployeeBO> getEmpBydesg(String cond) throws Exception;

}
