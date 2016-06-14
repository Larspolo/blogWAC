<%--
  Created by IntelliJ IDEA.
  User: larsd
  Date: 19-May-16
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<%@ page import="model.*" %>

<%

    ArrayList<BlogPost> allPosts = ServiceProvider.getBlogService().getAllPosts();

    request.setAttribute("allPosts", allPosts);

%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Dynamic Example</title>
</head>
<body>

<%@ include file="/header.jsp" %>
<c:if test="${loggedUser == null}">
    <form action="/login.do" method="post">

        <c:if test="${msg != null}">
            <span class="error">${msg}</span><br />
        </c:if>

        <input id="username" name="username" type="text" placeholder="username" value="${cookie.username.value}" />
        <input id="password" name="password" type="password" placeholder="password"  />

        <input id="submit" value="Login" type="submit" />
    </form>
</c:if>

<c:forEach var="post" items="${allPosts}">
    <div class="post">
        <h1>${post.subject}</h1>
        <p>${post.text}</p>
    </div>
</c:forEach>
</body>
</html>

