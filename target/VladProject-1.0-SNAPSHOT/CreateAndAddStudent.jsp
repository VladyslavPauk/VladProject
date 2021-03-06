<%--
  Created by IntelliJ IDEA.
  User: vlady
  Date: 06.03.2021
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> </title>
</head>
<body>
    <h1>Please enter the next field</h1>
<form action="/list-student" method="post">
    name <input type="text" name="name">
    surname <input type="text" name="surname">
    age <input type="number" name="age">
    groupId <input type="number" name="groupId">
    id <input type="number" name="id">
    <input type="submit" value="Save">

</form>

</body>
</html>
