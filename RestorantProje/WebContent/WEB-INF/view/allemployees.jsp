<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="../../resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="badge">
		<c:forEach var="employee" items="${employees}">
			<table border="1" width="30%" cellpadding="3">
				<tr>
					<td><c:out value="${employee.id }" /></td>
					<td><c:out value="${employee.name }" /></td>
					<td><c:out value="${employee.salary }" /></td>
					<td><c:out value="${employee.ssn }" /></td>
				</tr>
			</table>
		</c:forEach>
	</div>
</body>
</html>