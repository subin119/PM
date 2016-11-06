package com.dat.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dat.service.IndexService;
import com.dat.vo.DepartmentVO;
import com.dat.vo.EmployeeVO;

@Controller
public class IndexController {
	
	private IndexService indexService;
	
	public void setIndexService(IndexService indexService) {
		this.indexService = indexService;
	}

	@RequestMapping("/")
	public String viewIndexPage() {
		return "index";
	}
	
	@RequestMapping("/sub")
	public ModelAndView viewSubPage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("sub");
		view.addObject("key1", "value1");
		view.addObject("key2", "value2");
		view.addObject("key3", "value3");
		
		return view;
	}
	
	@RequestMapping("/now")
	public ModelAndView viewNowDateTime() {
		ModelAndView view = new ModelAndView();
		
		String nowDateTime = indexService.getNowDateTime();
		
		view.setViewName("now");
		view.addObject("now", nowDateTime);
		return view;
	}
	
	//Employees
	@RequestMapping("/pm/employees")
	public ModelAndView viewAllEmployeePage(){
		
		List<EmployeeVO> employees = indexService.getAllEmployees();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("pm/employees");
		view.addObject("employees", employees);
		return view;
	}
	
	@RequestMapping("/pm/addNewEmployee")
	public String viewAddNewEmployee() {
		return "pm/addNewEmployee";
	}
	
	@RequestMapping("/pm/doAddNewEmployee")
	public ModelAndView doAddNewEmployee(@Valid EmployeeVO employee, Errors errors) {
		ModelAndView view = new ModelAndView();
		
		if(errors.hasErrors()) {
			view.setViewName("pm/addNewEmployee");			
		}
		else {
			boolean isSuccess = indexService.addNewEmployee(employee);
			view.setViewName("redirect:/pm/employees");
		}
		return view;
	}
	
	@RequestMapping("/pm/employees/{employeeId}")
	public ModelAndView viewEmployeePage(@PathVariable String employeeId) {
		
		EmployeeVO employee = indexService.getEmployeeById(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("pm/employees");
		view.addObject("employee", employee);
		return view;
	}
	
	@RequestMapping("/pm/employees/doDeleteEmployee/{employeeId}")
	public ModelAndView doDeleteEmployee(@PathVariable String employeeId) {
		
		boolean isSuccess = indexService.deleteEmployeeById(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/pm/employees");
		return view;
	}
	
	@RequestMapping("/pm/employees/doPromoteEmployee/{employeeId}") 
	public ModelAndView doPromoteEmployee(@PathVariable String employeeId) {
		
		boolean isSuccess = indexService.promoteEmployee(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/pm/employees");
		return view;
	}
	
	//Departments
	@RequestMapping("/pm/departments")
	public ModelAndView viewAllDepartments() {
		
		List<DepartmentVO> departments = indexService.getAllDepartments();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("pm/departments");
		view.addObject("departments", departments);
		return view;
	}
	
	@RequestMapping("/pm/addNewDepartment")
	public String viewAddNewDepartment() {
		return "pm/addNewDepartment";
	}
	
	@RequestMapping("/pm/doAddNewDepartment")
	public ModelAndView doAddNewDepartment(@Valid DepartmentVO department, Errors errors) {
		ModelAndView view = new ModelAndView();
		
		if(errors.hasErrors()) {
			view.setViewName("pm/addNewDepartment");
		}
		else {
			boolean isSuccess = indexService.addNewDepartment(department);
			view.setViewName("redirect:/pm/departments");
		}
		return view;
	}
	
	@RequestMapping("/pm/departments/{departmentId}")
	public ModelAndView viewDepartmentPage(@PathVariable String departmentId) {
		
		DepartmentVO department = indexService.getDepartmentById(departmentId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("pm/departments");
		view.addObject("department", department);
		return view;
	}
	
	@RequestMapping("/pm/departments/doDeleteDepartment/{departmentId}")
	public ModelAndView doDeleteDepartment(@PathVariable String departmentId) {
		
		boolean isSuccess = indexService.deleteDepartment(departmentId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/pm/departments");
		return view;
	}

	@RequestMapping("/pm/registerDepartment")
	public String viewRegisterDepartment() {
		return "pm/registerDepartment";
	}
	
	@RequestMapping("/pm/employees/doRegisterDepartment/")
	public ModelAndView doRegisterDepartment(@RequestParam String departmentId, String employeeId) {
		
		Map<String, String> registerDepartment = new HashMap<String, String>();
		registerDepartment.put("employeeId", employeeId);
		registerDepartment.put("departmentId", departmentId);
		
		boolean isSuccess = indexService.registerDepartment(registerDepartment);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/pm/employees");
		return view;
	}
	
}
