package com.dat.dao;

import java.util.List;
import java.util.Map;

import com.dat.vo.DepartmentVO;
import com.dat.vo.EmployeeVO;

public interface IndexDao {

	public String getNowDateTime();

	public List<EmployeeVO> getAllEmployees();

	public int addNewEmployee(EmployeeVO employee);

	public EmployeeVO getEmployeeById(String employeeId);

	public int deleteEmployeeById(String employeeId);

	public int promoteEmployee(String employeeId);

	public List<DepartmentVO> getAllDepartments();

	public int addNewDepartment(DepartmentVO department);

	public int deleteDepartment(String departmentId);

	public DepartmentVO getDepartmentById(String departmentId);

	public int registerDepartment(Map<String, String> registerDepartment);

}
