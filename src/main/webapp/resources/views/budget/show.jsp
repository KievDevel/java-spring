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
<h1>budget</h1>
    <div class="form-group">
        <p>id: ${budget.id}</p><br>
    </div>
    <div class="form-group">
        <p>name: ${budget.project_name}</p><br>
    </div>
    <div class="form-group">
        <p>amount: ${budget.amount}</p><br>
    </div>
    <div class="form-group">
        <p>header: ${budget.days_allowed}</p><br>
    </div>
<a href="${pageContext.request.contextPath}/budgets">
    <button class="btn-default">all</button>
</a>
</body>
</html>