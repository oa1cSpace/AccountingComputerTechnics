<%@page import="CRUD.DeleteValues"%>
<%@page import="CRUD.EditValues"%>
<%@page import="common.TechnicsBean"%>
<%@ page import="CRUD.InsertValues" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		
	DeleteValues delete = new DeleteValues();
	
	delete.deleteValue(id);
	
	%>
	
	// to stay on the same page after INSERT
	<script type="text/javascript">
	window.location.href="http://localhost:8080/AccountingComputerTechnics/insertValues.jsp";
	</script>
	
</body>
</html>