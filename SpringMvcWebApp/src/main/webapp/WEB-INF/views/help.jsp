<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--for jsp page expression language  --%>
<%@page isELIgnored="false"%>
<%--this directory is used from jstl core from oracle.doc site --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help jsp</title>
</head>
<body>
	<%
	/*String name = (String) request.getAttribute("name");
	Integer RollNo = (Integer) request.getAttribute("RollNo");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	*/
	%>
	<h1>
		Hello! My name is=
		<%-- <%=name--%>
		${name }
	</h1>
	<h1>
		This is my Roll No=
		<%-- <%=RollNo--%>
		${RollNo }
	</h1>
	<h1>
		This is data n time
		<%-- <%=time --%>
		${time }
	</h1>
	<hr>
	
	<c:forEach var="item" items="${marks }">
	<%-- <h1>${item }</h1> --%>
	<h1><c:out value= "${item }"></c:out></h1>
	</c:forEach>


</body>
</html>