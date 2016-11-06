package com.dat.service.impl;

import java.util.List;
import java.util.Map;

import com.dat.biz.IndexBiz;
import com.dat.service.IndexService;
import com.dat.vo.DepartmentVO;
import com.dat.vo.EmployeeVO;

public class IndexServiceImpl implements IndexService{
	
	private IndexBiz indexBiz;

	public void setIndexBiz(IndexBiz indexBiz) {
		this.indexBiz = indexBiz;
	}
	
	@Override
	public String getNowDateTime() {
		return indexBiz.getNowDateTime();
	}
	
	@Override
	public List<EmployeeVO> getAllEmployees() {
		return indexBiz.getAllEmployees();
	}
	
	@Override
	public boolean addNewEmployee(EmployeeVO employee) {
		return indexBiz.addNewEmployee(employee);
	}
	
	@Override
	public EmployeeVO getEmployeeById(String employeeId) {
		return indexBiz.getEmployeeById(employeeId);
	}
	
	@Override
	public boolean deleteEmployeeById(String employeeId) {
		return indexBiz.deleteEmployeeById(employeeId);
	}
	
	@Override
	public boolean promoteEmployee(String employeeId) {
		return indexBiz.promoteEmployee(employeeId);
	}
	
	@Override
	public List<DepartmentVO> getAllDepartments() {
		return indexBiz.getAllDepartments();
	}
	
	@Override
	public boolean addNewDepartment(DepartmentVO department) {
		return indexBiz.addNewDepartment(department);
	}
	
	@Override
	public DepartmentVO getDepartmentById(String departmentId) {
		return indexBiz.getDepartmentById(departmentId);
	}
	
	@Override
	public boolean deleteDepartment(String departmentId) {
		return indexBiz.deleteDepartment(departmentId);
	}
	
	@Override
	public boolean registerDepartment(Map<String, String> registerDepartment) {
		return indexBiz.registerDepartment(registerDepartment);
	}
}
