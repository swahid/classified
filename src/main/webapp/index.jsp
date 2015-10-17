<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Classifeid Site Sample</title>
		 <link rel="stylesheet" href="./WEB-INF/resources/css/indexCss.css" type="text/css"/>
	</head> 
	<body>
		<div id="container">
		<div id="header">Header</div>
		<div id="body">
		<div id="left">Body</div>	
		<div id="middle">
		<c:url value="/show" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a></div>	
		<div id="right">Body</div>	
		</div>		
		<div id="footer">footer</div>
		</div>
		
	</body>
</html>
