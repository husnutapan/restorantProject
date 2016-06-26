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
		<table st-table="rowCollection" class="table table-striped">
			<thead>
				<tr>
					<th>Masa Name</th>
					<th>IsOnline</th>
					<th>Siparis</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="masa in masaCtrl.masalar">
					<td>{{masa.name | uppercase}}</td>
					<td><img src="resources/images/restrorant_online.jpg"
						height="30" width="30"></td>
					<td>
						<button type="button" class="btn btn-sm btn-danger"
							ng-click="masaCtrl.sendDataToDialog(masa)">
							<i class="glyphicon glyphicon-remove-circle"> </i>
						</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>


</body>

<link data-require="bootstrap-css@3.2.0" data-semver="3.2.0"
	rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />

<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/ng-dialog/0.4.0/css/ngDialog.min.css" />
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/ng-dialog/0.4.0/css/ngDialog-theme-default.min.css" />
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/ng-dialog/0.4.0/css/ngDialog-theme-plain.min.css" />


<script type="text/javascript"
	src="<c:url value='resources/bower_components/angular/angular.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='resources/bower_components/ng-dialog/js/ngDialog.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='resources/js/app.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='resources/js/service/masa_service.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='/resources/js/controller/masa_controller.js'/>"></script>
</html>
