
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.*" %>
<%@page import="javax.servlet.*" %>
<%@page import="javax.persistence.*" %>
<%@page import="school_managament.Teacher" %>

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

<h2 align="center">Teacher Details</h2>

<%	 int id=Integer.parseInt(request.getParameter("id"));
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Teacher s1=em.find(Teacher.class, id);
	if(s1!=null){

%>

<table align="center" border="1" cellspacing="0"  cellpadding="10">
<th>ID</th>
<th>NAME</th>
<th>SUBJECT</th>
<th>SALARY</th>

<%  { %>
<tr align="center">
<td><%= s1.getId() %>  </td>
<td><%= s1.getName() %>  </td>
<td><%= s1.getSubject()%>  </td>
<td><%= s1.getSalary() %>  </td>

</tr>

<% }}
	else{
		PrintWriter pw=response.getWriter();
		pw.write("Invalid ID..");
		RequestDispatcher rd=request.getRequestDispatcher("/SearchById1.html");
		rd.include(request, response);
		response.setContentType("text/html");
	}


%>

		<a href="Option1.html"><div class="a">MAIN MENU</div></a>


</table>
</body>
</html>