<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<title>Page Title</title>
<meta name="description"
	content="Write some words to describe your html page">
</head>
<body>
	<div class="blended_grid">

		<tiles:insertAttribute name="header" />

		<tiles:insertAttribute name="menu" />

		<tiles:insertAttribute name="body" />

		<tiles:insertAttribute name="footer" />

	</div>
</body>
</html>