<%--
  Created by IntelliJ IDEA.
  User: larsd
  Date: 21-May-16
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="header">

    HEADER
    <ul>
        <li><a href="/register.jsp">Register</a></li>
        <li><a href="/index.jsp">Homepage</a></li>
        <c:if test="${loggedUser != null}">
            <li><a href="/blogger/myaccount.jsp">My Account</a></li>
            <li><a href="/blogger/myposts.jsp">My Posts</a></li>

            <form action="logout.do" method="post"><br />
                <input type="submit" value="Logout!" />
            </form>
        </c:if>
    </ul>

</div>