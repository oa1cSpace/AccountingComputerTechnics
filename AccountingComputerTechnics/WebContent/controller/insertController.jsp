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
		String name = request.getParameter("name");
		String components = request.getParameter("components");
		String supplier = request.getParameter("supplier");
		String data_of_purchase = request.getParameter("data_of_purchase");
		String moving = request.getParameter("moving");
		// testin input data
		//out.println(name);
		//out.println(components);
		//out.println(supplier);
		
		
		InsertValues objInsert = new InsertValues();
		objInsert.insertValues(name, components, supplier, data_of_purchase, moving);
	%>
	
	// to stay on the same page after INSERT
	<script type="text/javascript">
	window.location.href="http://localhost:8080/AccountingComputerTechnics/insertValues.jsp";
	</script>
	
</body>
</html>