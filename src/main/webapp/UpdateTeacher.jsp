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
<title>Updation Form</title>
</head>
<body>
<%
	String i=request.getParameter("id");
	int id=Integer.parseInt(i);
	System.out.println(id);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Teacher s1=em.find(Teacher.class, id);
	int sid=s1.getId();


%>
	<form id="f" action="updateteacher" method="post">
	<fieldset >
		<legend align="center" id="rf">Updation Form</legend>
			<center>
			ID : <input type="text" value="<%=s1.getId() %>" name="id" placeholder="Name" autocomplete="off" required>
			<br><br>
			Name : <input type="text" value="<%=s1.getName() %>" name="name" placeholder="Name" autocomplete="off" required>
			<br><br>
			Subject : <input type="text" value="<%=s1.getSubject() %>" name="subject" placeholder="Stream" autocomplete="off" required>
			<br><br>
			Salary : <input type="text" value="<%=s1.getSalary() %>" name="salary" placeholder="Fees" autocomplete="off" required>
			<br><br>
			
			<input class="b" type="submit" value="SUBMIT"> &nbsp <input class="b" type="reset" value="RESET">
			</center>
	</fieldset>
</form>

</body>
</html>