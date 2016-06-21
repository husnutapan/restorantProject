<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.img {
	width: 15%;
}

.img img {
	max-width: 100%;
}
</style>
</head>
<body ng-app="myApp">

	<div ng-controller="MasaController as masaCtrl">
		<table>
			<tbody>
				<tr ng-repeat="masa in masaCtrl.masalar">
					<td><span ng-bind="masa.name"></span></td>
				</tr>
			</tbody>
		</table>
	</div>


	<div class="img">
		<img src="resources/images/restrorant_online.jpg">
	</div>
</body>

<script type="text/javascript"
	src="<c:url value='resources/bower_components/angular/angular.js'/>"></script>

<script type="text/javascript"
	src="<c:url value='resources/js/app.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='resources/js/service/masa_service.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='/resources/js/controller/masa_controller.js'/>"></script>
</html>

</html>