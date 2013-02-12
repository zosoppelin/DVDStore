<%-- 
    Document   : actor
    Created on : 12-02-2013, 03:15:04 PM
    Author     : ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="actor" items="${actores}">
            <c:out value="${actor.firstName}"></c:out><br />
        </c:forEach>
    </body>
</html>

