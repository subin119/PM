package com.dat.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


public class EmployeeVO {
	
	private String employeeId;
	private String positionId;
	
	@NotEmpty(message = "이름이 비었습니다!(공백)")
	@NotNull(message = "이름은 필수값입니다!")
	private String name;
	
	@NotEmpty(message = "직무가 비었습니다!(공백)")
	@NotNull(message = "직무는 필수값입니다!")
	private String jobId;

	private String departmentId;
	
	@Min(value = 0, message = "연봉이 비었습니다!(공백)")
	@Range(min = 0, max = Integer.MAX_VALUE, message = "연봉은 필수값입니다!")
	private int salary;
	
	private PositionVO positionVO;
	
	private DepartmentVO departmentVO;
	
	public DepartmentVO getDepartmentVO() {
		return departmentVO;
	}
	public void setDepartmentVO(DepartmentVO departmentVO) {
		this.departmentVO = departmentVO;
	}
	public PositionVO getPositionVO() {
		return positionVO;
	}
	public void setPositionVO(PositionVO positionVO) {
		this.positionVO = positionVO;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
