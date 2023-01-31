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
	
	Student s1=em.find(Student.class, id);
	int sid=s1.getId();


%>
	<form id="f" action="updatestudent" method="post">
	<fieldset >
		<legend align="center" id="rf">Updation Form</legend>
			<center>
			ID : <input type="text" value="<%=s1.getId() %>" name="id" placeholder="Name" autocomplete="off" required>
			<br><br>
			Name : <input type="text" value="<%=s1.getName() %>" name="name" placeholder="Name" autocomplete="off" required>
			<br><br>
			Stream : <input type="text" value="<%=s1.getStream()%>" name="stream" placeholder="Stream" autocomplete="off" required>
			<br><br>
			Fees : <input type="text" value="<%=s1.getFees()%>" name="fees" placeholder="Fees" autocomplete="off" required>
			<br><br>
			
			<input class="b" type="submit" value="SUBMIT"> &nbsp <input class="b" type="reset" value="RESET">
			</center>
	</fieldset>
</form>

</body>
</html>