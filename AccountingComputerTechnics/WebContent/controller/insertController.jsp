<%@ page import="CRUD.InsertValues" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TECHNICS</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String components = request.getParameter("components");
		String supplier = request.getParameter("supplier");
		String data_of_purchase = request.getParameter("data_of_purchase");
		String moving = request.getParameter("moving");
		String existing = request.getParameter("existing");
		String employee = request.getParameter("employee");
		String state = request.getParameter("state");
		String repair = request.getParameter("repair");
		String description = request.getParameter("description");
		
		// testin input data
		//out.println(name);
		//out.println(components);
		//out.println(supplier);
		
		
		InsertValues objInsert = new InsertValues();
		objInsert.insertValues(name, components, supplier, data_of_purchase, moving,
				existing, employee, state, repair, description);
	%>
	
	// to stay on the same page after INSERT
	<script type="text/javascript">
	window.location.href="http://localhost:8080/AccountingComputerTechnics/insertValues.jsp";
	</script>
	
</body>
</html>