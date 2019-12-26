<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome!</h1>
	<p>Home page</p>

	<hr>
	
	<form:form action="processForm" method="POST" modelAttribute="user">
		<table>
			<tr>
				<td>Name: </td>
				<td><form:input type="text" path="name" /></td>
			</tr>
			<tr>
				<td><form:errors path="name"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>