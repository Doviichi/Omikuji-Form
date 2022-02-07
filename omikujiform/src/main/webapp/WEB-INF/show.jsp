<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show my omikuji</title>
</head>
<body>
<h1>
show Omikuji
</h1>
<h1><c:out value="${result}"/></h1>
<div>
<a href="/welcome"> go back </a>
</div>
</body>
</html>