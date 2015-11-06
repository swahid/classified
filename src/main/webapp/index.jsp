<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Classifeid Site Sample</title>
	</head> 
	<body>
		<h1>Welcome To Classifeid Sites</h1>
		<h2>choose Your location</h2>
		<h3>Bangladesh</h3>
		<c:url var="entry" value="/home"></c:url>
		<a href="<c:url value='/home/Dhaka'/>">Dhaka</a>
		
	</body>
</html>
