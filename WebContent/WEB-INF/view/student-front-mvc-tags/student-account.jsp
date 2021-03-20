<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="processmvctags" modelAttribute="student">
		FirstName : <f:input path="fName"/>
		<br>
		LastName : <f:input path="lName"/>
		<br>
		Age : <f:input path="age"/>
		<br>
		Country : 
		<f:select path="country">
			<f:options items="${student.countryOptions}"/>
		</f:select>
		
		<br>
		Choose your language :
		
		<f:radiobutton path="language" value="Java"/>Java
		<f:radiobutton path="language" value="Php"/>Php
		<f:radiobutton path="language" value="C++"/>C++
		<f:radiobutton path="language" value="C#"/>C#
		<br>
		Players :
		<f:checkbox path="players" value="Messi"/>Messi
		<f:checkbox path="players" value="CR7"/>CR7
		<f:checkbox path="players" value="Salah"/>Salah
		<br>
		<input type="submit" value="Done">
		
	</f:form>
</body>
</html>