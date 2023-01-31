
<%@page import="java.util.*" %>
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

<h2 align="center">Student Details</h2>

<%	 List<Teacher> ll=(List)session.getAttribute("teacher"); %>

<table align="center" border="1" cellspacing="0"  cellpadding="10">
<th>ID</th>
<th>NAME</th>
<th>SUBJECT</th>
<th>SALARY</th>

<% for(Teacher s :ll) { %>
<tr align="center">
<td><%= s.getId() %>  </td>
<td><%= s.getName() %>  </td>
<td><%= s.getSubject()%>  </td>
<td><%= s.getSalary() %>  </td>

</tr>

<% }%>

<a href="Option1.html"><div class="a">MAIN MENU</div></a>

</table>
</body>
</html>