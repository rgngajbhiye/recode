<%@page import="model.Admin"%>


<%@page import="java.util.List"%>
<%@page import="model.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr> <th>Id</th> <th>Name</th> <th>Phone</th>  <th>Pass</th> <th>Action</th> </tr>
<%
AdminDao db=new AdminDao();
List<Admin> ul=db.show();

for(Admin u:ul)
{
	%>
	<tr><td><%=u.getId() %></td>  <td><%=u.getName() %></td><td><%=u.getPhone() %></td> <td><%=u.getEmail() %></td>
	
	<td>
	<a href="update.jsp?aid=<%=u.getId()%>">Update</a>
	
	</td>
	
	
	</tr>
	
	
	
<% 	
}
%>





</table>




</body>
</html>