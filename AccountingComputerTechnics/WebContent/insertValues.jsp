<%@page import="java.util.Iterator"%>
<%@page import="common.TechnicsBean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.ReadValues"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TECHNICS DB</title>
</head>
<body>


<div style="text-align:center" >
 
<h1>Insert values</h1>
	
		<form action="controller/insertController.jsp">
		
		<div  >
			<!-- <p>ID:<input type="text" name=id><br></p> -->
			<p>Name:<input type="text" name=name><br></p>
			<p>Components:<input type="text" name=components><br></p>
			<p>Supplier:<input type="text" name=supplier><br></p>
			<p>Data_of_purchase:<input type="text" name=data_of_purchase><br></p>
			<p>Moving:<input type="text" name=moving><br></p>
			<p>Existing:<input type="text" name=existing><br></p>
			<p>Employee:<input type="text" name=employee><br></p>
			<p>State:<input type="text" name=state><br></p>
			<p>Repair:<input type="text" name=repair><br></p>
			<p>Description:<input type="text" name=description><br></p>
			
			<input type="submit" value="Insert">
		
		</div>
					
		</form>
	
</div>

<hr>

<%
ReadValues read = new ReadValues();

List<TechnicsBean> list = read.getValues();

Iterator<TechnicsBean> iterList = list.iterator();
%>





<table  border="1" >
<%
while(iterList.hasNext()){
	TechnicsBean techBean = new TechnicsBean();
	techBean = iterList.next();
%>
<tr>
		<td><%=techBean.getId() %></td>
		<td><%=techBean.getName() %></td>
		<td><%=techBean.getComponents() %></td>
		<td><%=techBean.getSupplier() %></td>
		<td><%=techBean.getData_of_purchase() %></td>
		<td><%=techBean.getMoving() %></td>
		<td><%=techBean.getExisting() %></td>
		<td><%=techBean.getState() %></td>
		<td><%=techBean.getRepair() %></td>
		<td><%=techBean.getDescription() %></td>
		
		<td>
			<a href="edit.jsp?id=<%=techBean.getId()%>">Edit</a>
		</td>
</tr>	
<% 
}
%>	
</table>



</body>
</html>




















