<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title> supply</title>
    <script src="http://code.jquery.com/jquery-2.2.1.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">
</head>
<body>
<h1>supply</h1>
    <form:form  commandName="supply" method="post">
        <div class="form-group">
            <label for="department_name">department_name:</label><br>
            <form:input path="department_name"/>
        </div>
        <div class="form-group">
            <label for="manager_name">manager_name:</label><br>
            <form:input path="manager_name"/>
        </div>
        <div class="form-group">
            <label for="goods_list">goods_list:</label><br>
            <form:textarea path="goods_list"/>
        </div>
        <div class="form-group">
            <input class="btn btn-default" type="submit" value="save"/>
        </div>
    </form:form>
</body>
</html>