<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>KnowledgeBase</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">

</head>
<body>
<h1>budgets</h1>
<table>
    <tr>
        <th>id</th>
        <th>project_name</th>
        <th>amount</th>
        <th>days_allowed</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="budget" items= "${budgets}">
        <tr>
            <td>${budget.id}</td>
            <td>${budget.project_name}</td>
            <td>${budget.amount}</td>
            <td>${budget.days_allowed}</td>
            <td><a href="${pageContext.request.contextPath}budget/${budget.id}">show</a></td>
            <td><a href="${pageContext.request.contextPath}budget/${budget.id}/update">update</a></td>
            <td><a href="${pageContext.request.contextPath}budget/${budget.id}/delete">X</a></td>
        </tr>
    </c:forEach>
    <tr><td><a href="${pageContext.request.contextPath}budget/add">+</a></td></tr>
</table>
<br><br><br>
<a href="${pageContext.request.contextPath}/">
    <button class="btn-default">home</button>
</a>
</body>
</html>