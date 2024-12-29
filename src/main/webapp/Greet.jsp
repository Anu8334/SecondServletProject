<%@ page import = "java.time.LocalDate"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello from GreetJsp</title>
</head>
<body>
	<h1>What an amazing day!...</h1>
	
	<% //eta ke scriptlet tag bole ekhane java r code directly jsp er modhye punch korte pari
	String name = (String)request.getAttribute("name");
	LocalDate currentDate = LocalDate.now();
	%>
	<h2>Hello<%=name %></h2>
	<h3>It is now <%=currentDate %></h3>
</body>
</html>

