package com.dat.biz.impl;

import java.util.List;
import java.util.Map;

import com.dat.biz.IndexBiz;
import com.dat.dao.IndexDao;
import com.dat.vo.DepartmentVO;
import com.dat.vo.EmployeeVO;

public class IndexBizImpl implements IndexBiz{

	private IndexDao indexDao;

	public void setIndexDao(IndexDao indexDao) {
		this.indexDao = indexDao;
	}
	
	@Override
	public String getNowDateTime() {
		return indexDao.getNowDateTime();
	}
	
@Override
	public List<EmployeeVO> getAllEmployees() {
		return indexDao.getAllEmployees();
	}

	@Override
	public boolean addNewEmployee(EmployeeVO employee) {
		return indexDao.addNewEmployee(employee) > 0;
	}
	
	@Override
	public EmployeeVO getEmployeeById(String employeeId) {
		return indexDao.getEmployeeById(employeeId);
	}
	
	@Override
	public boolean deleteEmployeeById(String employeeId) {
		return indexDao.deleteEmployeeById(employeeId) > 0;
	}
	
	@Override
	public boolean promoteEmployee(String employeeId) {
		return indexDao.promoteEmployee(employeeId) > 0;
	}
	
	@Override
	public List<DepartmentVO> getAllDepartments() {
		return indexDao.getAllDepartments();
	}
	
	@Override
	public boolean addNewDepartment(DepartmentVO department) {
		return indexDao.addNewDepartment(department) > 0;
	}
	
	@Override
	public DepartmentVO getDepartmentById(String departmentId) {
		return indexDao.getDepartmentById(departmentId);
	}
	
	@Override
	public boolean deleteDepartment(String departmentId) {
		return indexDao.deleteDepartment(departmentId) > 0;
	}
	
	@Override
	public boolean registerDepartment(Map<String, String> registerDepartment) {
		return indexDao.registerDepartment(registerDepartment) > 0;
	}
}
