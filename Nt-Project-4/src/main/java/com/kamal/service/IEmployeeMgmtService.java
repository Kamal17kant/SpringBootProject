package com.kamal.service;

import java.util.List;

import com.kamal.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	public List<EmployeeDTO> fetchEmpByDesg(String desg[]) throws Exception;

}
