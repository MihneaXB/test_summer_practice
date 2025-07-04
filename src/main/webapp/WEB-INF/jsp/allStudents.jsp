<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <title>Students Page</title>
    <nav>
        <li><a href="/allStudents">Studenti</a></li>
        <li><a href="/allSchools">Scoli</a></li>
    </nav>
    <link href="<c:url value="/static/css/common.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
    <h1>Lista tuturor studentilor:</h1>
    <ul class="list-table">
        <c:forEach var="student" items="${allStudents}">
            <li>${student.name} - ${student.age} ani.</li>
        </c:forEach>
    </ul>
    <script type="text/javascript" src="<c:url value="/static/script/common.js"/>"></script>
</body>
</html>
