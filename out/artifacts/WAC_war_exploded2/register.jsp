<%--
  Created by IntelliJ IDEA.
  User: larsd
  Date: 20-May-16
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form action="register.do" method="post">

    <span class="error">${msg}</span><br />
    <input id="username" name="username" placeholder="username" type="text" /><br />
    <input id="password" name="password" placeholder="password" type="password" /><br />
    <input id="repeat" name="repeat" placeholder="repeat password" type="password" /><br />
    <input id="name" name="name" placeholder="full name" type="text" /><br />
    <input id="email" name="email" placeholder="email" type="email" /><br />

    <input id="submit" value="Register!" type="submit" />

</form>

</body>
</html>
