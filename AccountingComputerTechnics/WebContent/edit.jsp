<%@page import="common.TechnicsBean"%>
<%@page import="CRUD.EditValues"%>
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
String id = (String)request.getParameter("id");

EditValues edit = new EditValues();

TechnicsBean techBean = edit.getValuesOfTechnic(id);
%>


<div style="text-align:center" >
 
<h1>Edit values</h1>
	
		<form action="controller/editController.jsp">
		
		<div  >
			
			<p>ID:<input type="text" name=id value="<%=id%>"><br></p>
			
		    <p>Name:<input type="text" name=name value=<%=techBean.getName()%>><br></p>
			<p>Components:<input type="text" name=components value=<%=techBean.getComponents()%>><br></p>
			<p>Supplier:<input type="text" name=supplier value=<%=techBean.getSupplier()%>><br></p>
			<p>Data_of_purchase:<input type="text" name=data_of_purchase value=<%=techBean.getData_of_purchase()%>><br></p>
			<p>Moving:<input type="text" name=moving value=<%=techBean.getMoving()%>><br></p>
			<p>Existing:<input type="text" name=existing value=<%=techBean.getExisting()%>><br></p>
			<p>Employee:<input type="text" name=employee value=<%=techBean.getEmployee()%>><br></p>
			<p>State:<input type="text" name=state value=<%=techBean.getState()%>><br></p>
			<p>Repair:<input type="text" name=repair value=<%=techBean.getRepair()%>><br></p>
			<p>Description:<input type="text" name=description value=<%=techBean.getDescription()%>><br></p>
			
			<input type="submit" value="Edit">
		
		</div>
					
		</form>
	
</div>
</body>
</html>