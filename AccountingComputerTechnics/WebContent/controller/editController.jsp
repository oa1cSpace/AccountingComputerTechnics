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
		
		TechnicsBean objTechBean = new TechnicsBean();
		
		objTechBean.setId(id);
		objTechBean.setName(name);
		objTechBean.setComponents(components);
		objTechBean.setSupplier(supplier);
		objTechBean.setData_of_purchase(data_of_purchase);
		objTechBean.setMoving(moving);
		objTechBean.setExisting(existing);
		objTechBean.setEmployee(employee);
		objTechBean.setState(state);
		objTechBean.setRepair(repair);
		objTechBean.setDescription(description);
		
		EditValues objEditValues = new EditValues();
		objEditValues.editTechnic(objTechBean);
		
	%>
	
	// to stay on the same page after INSERT
	<script type="text/javascript">
	window.location.href="http://localhost:8080/AccountingComputerTechnics/insertValues.jsp";
	</script>
	
</body>
</html>