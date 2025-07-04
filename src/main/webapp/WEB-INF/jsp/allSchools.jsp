<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mihne
  Date: 7/4/2025
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Schools Page</title>
    <nav>
      <li><a href="/students">Studenti</a></li>
      <li><a href="/schools">Scoli</a></li>
    </nav>
    <link href="<c:url value="/static/css/common.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
  <h1>Lista tuturor scolilor</h1>
  <c:forEach var="school" items="${allSchools}">
    <h2>${school.name}</h2>
    <ul class="list-table">
      <c:forEach var="student" items="${school.students}">
        <li>${student.name} - ${student.age} ani</li>
      </c:forEach>
    </ul>
  </c:forEach>
  <script type="text/javascript" src="<c:url value="/static/script/common.js"/>"></script>
</body>
</html>
