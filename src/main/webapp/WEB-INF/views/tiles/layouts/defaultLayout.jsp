<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>


<head>
	<title><tiles:insertAttribute name="title" defaultValue="Default Layout"/></title>
	<link rel="stylesheet" href="<c:url value='/static/css/global.css'/>"/>
	<tiles:insertAttribute name="stylesheets" defaultValue=""/>
	<tiles:insertAttribute name="scripts-head" defaultValue=""/>
</head>


<body class="min-body-dimensions">
	<div>
		<tiles:insertAttribute name="header" defaultValue="<div>Header goes here</div>"/>
		<tiles:insertAttribute name="main" defaultValue="<div>Main goes here</div>"/>
		<tiles:insertAttribute name="footer" defaultValue="<div>Footer goes here</div>"/>
	</div>
	<tiles:insertAttribute name="scripts-body-end" defaultValue=""/>
</body>


</html>