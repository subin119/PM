package com.dat.service;

import java.util.List;
import java.util.Map;

import com.dat.vo.DepartmentVO;
import com.dat.vo.EmployeeVO;

public interface IndexService {

	public String getNowDateTime();

	public List<EmployeeVO> getAllEmployees();

	public boolean addNewEmployee(EmployeeVO employee);

	public EmployeeVO getEmployeeById(String employeeId);

	public boolean deleteEmployeeById(String employeeId);

	public boolean promoteEmployee(String employeeId);

	public List<DepartmentVO> getAllDepartments();

	public boolean addNewDepartment(DepartmentVO department);

	public boolean deleteDepartment(String departmentId);

	public DepartmentVO getDepartmentById(String departmentId);

	public boolean registerDepartment(Map<String, String> registerDepartment);

}
