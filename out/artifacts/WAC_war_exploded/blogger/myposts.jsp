<%@ page import="model.BlogPost" %>
<%@ page import="model.User" %>
<%--
  User: Lars der Polo
  Date: 20-May-16
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<style>
    .post {
        padding: 20px;
    }
</style>
<body>

<%@ include file="/header.jsp" %>

<c:forEach var="post" items="${loggedUser.myPosts}">
    <div class="post">
        <h1>${post.subject}</h1>
        <p>${post.text}</p>
    </div>
</c:forEach>
<a href="/blogger/myaccount.jsp">Add more posts here!</a>
</body>
</html>
