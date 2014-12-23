<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Форма входа</title>
</head>
<body>

<h1>Вход в систему</h1>

<form action="login.jsp" method="get">
    <label>
        Login: <input type="text" name="login"/>
    </label>
    <label>
        Password: <input type="password" name="password"/>
    </label>
    <input type="submit" value="Enter!">
</form>
</body>
</html>
