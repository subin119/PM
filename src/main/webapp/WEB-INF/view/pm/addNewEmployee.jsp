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
	<c:url var="doAddNewEmployee" value="/pm/doAddNewEmployee"/>
	<form:form	commandName="employeesVO"
				method="post"
				action="${doAddNewEmployee}">
				
		<label for="name">이름 : </label>
		<input type="text" id="name" name="name"/>
		<form:errors path="name"/><br/>
		
		<label for="jobId">직무 : </label>
		<input type="text" id="jobId" name="jobId"/>
		<form:errors path="jobId"/><br/>
		
		<label for="salary">연봉 : </label>
		<input type="text" id="salary" name="salary"/>
		<form:errors path="salary"/><br/><br/>
		
		<input type="submit" value="사원 등록"/>
				
	</form:form>	
	
</body>
</html>