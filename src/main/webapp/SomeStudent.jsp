<%@ page import="com.example.VladProject.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: vlady
  Date: 27.02.2021
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello</h1>
<%
    Student someStudent = (Student) request.getAttribute("student");
%>
<%=someStudent%>

<form action="/list-student" method="get">
    <p><input type="submit" value="Delete this Student"></p>
</form>
</body>
</html>
