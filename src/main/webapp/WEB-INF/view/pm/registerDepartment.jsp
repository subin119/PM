<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url var="doRegisterDepartment" value="/pm/doRegisterDepartment"/>
	<form:form	commandName="employeesVO"
				method="post"
				action="${doRegisterDepartment}">
				
		<label for="departmentId">부서번호 : </label>
		<input type="text" id="departmentId" name="departmentId"/><br/><br/>
		
		<input type="button" value="부서등록" onclick="location.href='/PM/pm/employees/doRegisterDepartment?departmentId=${department.departmentId}&&employeeId=${employee.employeeId}'"><br/>
				
	</form:form>	
</body>
</html>