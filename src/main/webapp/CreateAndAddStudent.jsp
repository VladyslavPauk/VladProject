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
    <title></title>
</head>
<body>
<h1>Please enter the next field</h1>

<form action="/list-student" method="post">
    <p> name <input type="text" name="name"></p>
    <p> surname <input type="text" name="surname"></p>
    <p> age <input type="number" name="age"></p>
    <p> groupId <input type="number" name="groupId"></p>
    <p> id <input type="number" name="id"></p>
    <p> <input type="submit" value="Save"></p>
</form>

</body>
</html>
