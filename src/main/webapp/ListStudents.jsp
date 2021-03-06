<%@ page import="java.util.List" %>
<%@ page import="com.example.VladProject.Student" %><%--
  Created by IntelliJ IDEA.
  User: vlady
  Date: 24.02.2021
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListStudents</title>
</head>
<body>
<h1>List Students</h1>
<% List<Student> list = (List<Student>) request.getAttribute("studentsList");
    for (int i = 0; i < list.size(); i++) {
        out.println("<p><a target=\"_blank\" href=" + "http://localhost:8080/list-student?id=" + list.get(i).getId() + ">" + list.get(i) + "</a></p>");
    }
    ;
%>
<form action="/list-student" method="Post">
    <p><input type="submit" value="Add Student"></p>
</form>
</body>
</html>
