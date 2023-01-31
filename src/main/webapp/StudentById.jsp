
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.*" %>
<%@page import="javax.servlet.*" %>
<%@page import="javax.persistence.*" %>
<%@page import="school_managament.Student" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div.a{
			position: absolute;
			right: 0px;
			width: 150px;
			height: 30px;
			font-size: 20px;
			background-color: tomato;
		}
</style>
</head>
<body>

<h2 align="center">Student Details</h2>

<%	 int id=Integer.parseInt(request.getParameter("id"));
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s1=em.find(Student.class, id);
	if(s1!=null){
%>

<table align="center" border="1" cellspacing="0"  cellpadding="10">
<th>ID</th>
<th>NAME</th>
<th>STREAM</th>
<th>FEES</th>

<%  { %>
<tr align="center">
<td><%= s1.getId() %>  </td>
<td><%= s1.getName() %>  </td>
<td><%= s1.getStream() %>  </td>
<td><%= s1.getFees() %>  </td>

</tr>

<% }}
	else{
		PrintWriter pw=response.getWriter();
		pw.write("Invalid ID..");
		RequestDispatcher rd=request.getRequestDispatcher("/SearchById.html");
		rd.include(request, response);
		response.setContentType("text/html");
	}

%>

<a href="Option.html"><div class="a">MAIN MENU</div></a>

</table>
</body>
</html>