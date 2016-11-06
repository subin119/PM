package com.dat.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.dat.dao.IndexDao;
import com.dat.vo.DepartmentVO;
import com.dat.vo.EmployeeVO;

public class IndexDaoImpl extends SqlSessionDaoSupport implements IndexDao{

	public String getNowDateTime() {
		return getSqlSession().selectOne("indexDao.getNowDateTime");
	}
	
	@Override
	public List<EmployeeVO> getAllEmployees() {
		return getSqlSession().selectList("indexDao.getAllEmployees");
	}
	
	@Override
	public int addNewEmployee(EmployeeVO employee) {
		return getSqlSession().insert("indexDao.addNewEmployee", employee);
	}
	
	@Override
	public EmployeeVO getEmployeeById(String employeeId) {
		return getSqlSession().selectOne("indexDao.getEmployeeById", employeeId);
	}
	
	@Override
	public int deleteEmployeeById(String employeeId) {
		return getSqlSession().delete("indexDao.deleteEmployeeById", employeeId);
	}
	
	@Override
	public int promoteEmployee(String employeeId) {
		return getSqlSession().update("indexDao.promoteEmployee", employeeId);
	}
	
	@Override
	public List<DepartmentVO> getAllDepartments() {
		return getSqlSession().selectList("indexDao.getAllDepartments");
	}
	
	@Override
	public int addNewDepartment(DepartmentVO department) {
		return getSqlSession().insert("indexDao.addNewDepartment", department);
	} 
	
	@Override
	public DepartmentVO getDepartmentById(String departmentId) {
		return getSqlSession().selectOne("indexDao.getDepartmentById", departmentId);
	}
	
	@Override
	public int deleteDepartment(String departmentId) {
		return getSqlSession().delete("indexDao.deleteDepartment", departmentId);
	}
	
	@Override
	public int registerDepartment(Map<String, String> registerDepartment) {
		return getSqlSession().update("indexDao.registerDepartment", registerDepartment);
	}
}
