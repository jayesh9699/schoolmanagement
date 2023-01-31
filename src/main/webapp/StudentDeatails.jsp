
<%@page import="java.util.*" %>
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

<%	 List<Student> ll=(List)session.getAttribute("student"); %>

<table align="center" border="1" cellspacing="0"  cellpadding="10">
<th>ID</th>
<th>NAME</th>
<th>STREAM</th>
<th>FEES</th>

<% for(Student s :ll) { %>
<tr align="center">
<td><%= s.getId() %>  </td>
<td><%= s.getName() %>  </td>
<td><%= s.getStream() %>  </td>
<td><%= s.getFees() %>  </td>

</tr>

<% }%>

<a href="Option.html"><div class="a">MAIN MENU</div></a>

</table>
</body>
</html>