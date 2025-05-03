<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%--this directory is used from jstl core from oracle.doc site --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<h1>${Header }</h1>
	<p>${Desc }</p>
	<hr>


	<h1>Welcome,${user.userName }</h1>
	<h1>Your email is ${user.email }</h1>
	<h1>Your password is ${user.password} try to secure the password.</h1>
</body>
</html>