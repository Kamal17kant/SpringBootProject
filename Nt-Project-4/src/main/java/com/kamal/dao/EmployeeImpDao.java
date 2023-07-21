package com.kamal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kamal.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeImpDao implements IEmployeeDAO {

	private static final String GET_EMP_BY_DEGS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE JOB IN";
	@Autowired
	private DataSource ds;

	@Override
	public List<EmployeeBO> getEmpBydesg(String cond) throws Exception {
		// TODO Auto-generated method stub
		List<EmployeeBO> listBO = null;
		try (Connection con = ds.getConnection(); Statement st = con.createStatement();) {
			ResultSet rs = st.executeQuery(GET_EMP_BY_DEGS + cond + "ORDER BY JOB");
			listBO = new ArrayList();
			EmployeeBO bo = null;
			while (rs.next()) {
				bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEName(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getDouble(4));
				bo.setDeptNo(rs.getInt(5));
				bo.setMgrNo(rs.getInt(6));
				listBO.add(bo);
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return listBO;
	}

}
