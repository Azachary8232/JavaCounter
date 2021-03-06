<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Current Count</title>
</head>
<body>

<div class="container m-5">
<h1>You have visited <span><a href="">http://your_server</a></span> <span> <c:out value="${count}"></c:out> </span> times.</h1>
<a href="/your_server">Test another visit?</a>
<a href="/your_server/x2">Test X2 visit?</a>
<a href="/your_server/counter/reset">Reset Count</a>
</div>
</body>
</html>