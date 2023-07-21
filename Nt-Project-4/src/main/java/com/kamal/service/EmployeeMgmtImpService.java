package com.kamal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamal.bo.EmployeeBO;
import com.kamal.dao.IEmployeeDAO;
import com.kamal.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtImpService implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<EmployeeDTO> fetchEmpByDesg(String[] desg) throws Exception {
		
		StringBuffer buffer=new StringBuffer("(");
		for(int i=0;i<desg.length;i++) {
			if(i==desg.length-1) 
				buffer.append("'"+desg[i]+"')");
			else
				buffer.append("'"+desg[i]+"',");
		}
		String cond=buffer.toString();
		//using Dao
		List<EmployeeBO> listBO=dao.getEmpBydesg(cond);
		//convert listBo into listdao
		List<EmployeeDTO> listDTO=new ArrayList();
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);//copy each property of  BO class data to DTO class data to othar but property name must match in both java beans
			dto.setSrNo(listDTO.size()+1);
			listDTO.add(dto);
			});
		return listDTO;
	}

}
