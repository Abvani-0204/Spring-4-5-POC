<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form:form method="POST" modelAttribute="webModel"
		action="registration">
		<table>
			<tr>
				<td>
					<div>
						<p>User Name :</p>
						<form:input path="uname" />
					</div>
				</td>
			</tr>

			<tr>
				<td>
					<div>
						<p>User Email :</p>
						<form:input path="umail" />
					</div>
				</td>
			</tr>

			<tr>
				<td>
					<div>
						<p>User Password :</p>
						<form:password path="upassword" />
					</div>
				</td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>