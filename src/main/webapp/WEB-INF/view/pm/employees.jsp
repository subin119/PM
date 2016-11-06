<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty employees}">
		<c:forEach items="${employees}" var="employee">
			사원번호 : <a href="/PM/pm/employees/${employee.employeeId}">${employee.employeeId}</a> | 
			이름 : ${employee.name} | 
			직급 : ${employee.positionVO.positionName} | 
			직무 : ${employee.jobId} | 
			연봉 : ${employee.salary} | 
			부서명 : ${employee.departmentVO.departmentName}<br/><br/>
		</c:forEach>
	</c:if>
		
	<c:if test="${not empty employee}">
		사원번호 : ${employee.employeeId} | 
		이름 : ${employee.name} | 
		직급 : ${employee.positionVO.positionName} | 
		직무 : ${employee.jobId} | 
		연봉 : ${employee.salary} | 
		부서명 : ${employee.departmentVO.departmentName}<br/><br/>
	<input type="button" value="사원퇴사" onclick="location.href='/PM/pm/employees/doDeleteEmployee/${employee.employeeId}'" />
	<input type="button" value="사원진급" onclick="location.href='/PM/pm/employees/doPromoteEmployee/${employee.employeeId}'" />
	<input type="button" value="부서등록" onclick="location.href='/PM/pm/registerDepartment'" />
	</c:if>
	<input type="button" value="사원 입사" onclick="location.href='/PM/pm/addNewEmployee'"/>
	<input type="button" value="사원 목록" onclick="location.href='/PM/pm/employees'"/>
	<input type="button" value="부서 목록" onclick="location.href='/PM/pm/departments'"/>
	
</body>
</html>