package com.kamal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kamal.dto.EmployeeDTO;
import com.kamal.service.IEmployeeMgmtService;
import com.kamal.vo.EmployeeVO;

@Controller("controller")
public class MainController {
	
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<EmployeeVO> displayEmpsByDesg(String desgs[]) throws Exception{
	//use service
		List<EmployeeDTO> listDTO=service.fetchEmpByDesg(desgs);
		//convert listDTO to ListVO
		List<EmployeeVO> listVO=new ArrayList();
		listDTO.forEach(dto->{
			EmployeeVO vo=new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			vo.setEName(String.valueOf(dto.getEName()));
			vo.setSal(String.valueOf(dto.getSal()));
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			vo.setMgrNo(String.valueOf(dto.getMgrNo()));
			vo.setJob(String.valueOf(dto.getJob()));
		});
		return listVO;
	}
}
