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
    <div class="form-group">
        <p>id: ${salary.id}</p><br>
    </div>
    <div class="form-group">
        <p>department_name: ${salary.manager_id}</p><br>
    </div>
    <div class="form-group">
        <p>manager_name: ${salary.sum}</p><br>
    </div>
    <div class="form-group">
        <p>goods_list: ${salary.days}</p><br>
    </div>
    <div class="form-group">
        <p>updated_at: ${salary.updated_at}</p><br>
    </div>
<a href="${pageContext.request.contextPath}/salary">
    <button class="btn-default">all</button>
</a>
</body>
</html>