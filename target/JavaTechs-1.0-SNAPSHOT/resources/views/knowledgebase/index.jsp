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
<h1>KnowledgeBase</h1>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>header</th>
        <th>text</th>
        <th>type</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="knowledgebase" items= "${knowledgebases}">
        <tr>
            <td>${knowledgebase.id}</td>
            <td>${knowledgebase.name}</td>
            <td>${knowledgebase.header}</td>
            <td>${knowledgebase.text}</td>
            <td>${knowledgebase.type}</td>
            <td><a href="${pageContext.request.contextPath}knowledgebase/${knowledgebase.id}">show</a></td>
            <td><a href="${pageContext.request.contextPath}knowledgebase/${knowledgebase.id}/update">update</a></td>
            <td><a href="${pageContext.request.contextPath}knowledgebase/${knowledgebase.id}/delete">X</a></td>
        </tr>
    </c:forEach>
    <tr><td><a href="${pageContext.request.contextPath}knowledgebase/add">+</a></td></tr>
</table>
<br><br><br>
<a href="${pageContext.request.contextPath}/">
    <button class="btn-default">home</button>
</a>
</body>
</html>