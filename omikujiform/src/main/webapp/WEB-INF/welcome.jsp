<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 
	Welcome! 
</h1>
<form action='/processFormData' method='post'>
<label>Pick any number between 5-35.</label>
<input type='text' name='number'>
<br>
<label>Enter the name of any city.</label>
<input type='text' name='city'>
<br>
<label>Enter the name of any person.</label>
<input type='text' name='person'>
<br>
<label>Enter professional endeavor or hobby:</label>
<input type='text' name='hobby' >
<br>
<label>Enter any type of living thing:</label>
<input type='text' name='thing'>
<br>
<label>Say something nice to someone:</label>
<input type='text' name='nice'>
<br>
<input type='submit' name='fortune'>
</form>
</body>
</html>