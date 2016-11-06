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
	<c:if test="${not empty departments}">
		<c:forEach items="${departments}" var="department">
			부서번호 : <a href="/PM/pm/departments/${department.departmentId}">${department.departmentId}</a> | 
			부서명 : ${department.departmentName}<br/><br/>
		</c:forEach>
	</c:if>
		
	<c:if test="${not empty department}">
			부서번호 : ${department.departmentId} | 
			부서명 : ${department.departmentName}<br/><br/>
	<input type="button" value="부서 삭제" onclick="location.href='/PM/pm/departments/doDeleteDepartment/${department.departmentId}'"/>
	<input type="button" value="부서 목록" onclick="location.href='/PM/pm/departments'"/>
	</c:if>
	<input type="button" value="부서 생성" onclick="location.href='/PM/pm/addNewDepartment'"/>
	<input type="button" value="사원 목록" onclick="location.href='/PM/pm/employees'"/>
</body>
</html>