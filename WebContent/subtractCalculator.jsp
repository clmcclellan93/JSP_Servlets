<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subtraction Calculator</title>
</head>
<body>
	
	<h1>Subtraction</h1>
	<form action="SubtractServlet" method="post">
	Enter two numbers to subtract:
	<input type="number" name="userInput1" size="10">
	<input type="number" name="userInput2" size="10">
	<input type="submit" value="Calculate Result">
	</form>
	<p><a href="index.jsp">Back to Calculator</a></p>
	
</body>
</html>