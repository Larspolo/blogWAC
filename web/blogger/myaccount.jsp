<%--
  Created by IntelliJ IDEA.
  User: larsd
  Date: 20-May-16
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>${loggedUser.name}</title>
</head>
<body>

<%@ include file="/header.jsp" %>

    Hello ${loggedUser.name}!<br />

    <form action="/postBlog.do" method="post">
        <c:if test="${msg != null}">
            <span class="error">${msg}</span><br />
        </c:if>
        <input id="subject" name="subject" placeholder="subject" type="text" /><br />
        <input id="text" name="text" placeholder="text" type="text" /><br />

        <input id="submitBlog" type="submit" value="create blog" />
    </form>
    <br />
    <br />
    <a href="/blogger/myposts.jsp">See all your posts here</a>

</body>
</html>
