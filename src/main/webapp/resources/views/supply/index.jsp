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
<h1>supply</h1>
<table>
    <tr>
        <th>id</th>
        <th>department_name</th>
        <th>manager_name</th>
        <th>goods_list</th>
        <th>updated_at</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="supply" items= "${supplys}">
        <tr>
            <td>${supply.id}</td>
            <td>${supply.department_name}</td>
            <td>${supply.manager_name}</td>
            <td>${supply.goods_list}</td>
            <td>${supply.updated_at}</td>
            <td><a href="${pageContext.request.contextPath}supply/${supply.id}">show</a></td>
            <td><a href="${pageContext.request.contextPath}supply/${supply.id}/update">update</a></td>
            <td><a href="${pageContext.request.contextPath}supply/${supply.id}/delete">X</a></td>
        </tr>
    </c:forEach>
    <tr><td><a href="${pageContext.request.contextPath}supply/add">+</a></td></tr>
</table>
<br><br><br>
<a href="${pageContext.request.contextPath}/">
    <button class="btn-default">home</button>
</a>
</body>
</html>