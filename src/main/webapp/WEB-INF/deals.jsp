<%--
  Created by IntelliJ IDEA.
  User: michaeldickens
  Date: 7/14/22
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <jsp:include page="../partials/head.jsp">
    <jsp:param name="title" value="Deals"/>
  </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"></jsp:include>
<c:if test="${not empty name}">
<h2>Hi, ${name}!
  </c:if>
  <c:choose>
  <c:when test="${not empty favorite}">
  &nbsp;We have some awesome deals on ${favorite} cookies!</h2>
</c:when>
<c:otherwise>
  </h2>
</c:otherwise>
</c:choose>
</body>
</html>
