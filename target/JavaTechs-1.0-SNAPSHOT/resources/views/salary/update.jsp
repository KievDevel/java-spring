<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>save/update manager</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">
</head>
<body>
<h1>salary</h1>
<form:form  commandName="salary" method="post">
    <div class="form-group">
        <label for="manager_id">manager_id:</label><br>
        <form:input path="manager_id"/>
    </div>
    <div class="form-group">
        <label for="sum">sum:</label><br>
        <form:input path="sum"/>
    </div>
    <div class="form-group">
        <label for="days">days :</label><br>
        <form:input path="days"/>
    </div>
    <div class="form-group">
        <input class="btn btn-default" type="submit" value="save"/>
    </div>
</form:form>
</body>
</html>