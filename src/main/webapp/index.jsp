<%@ page import="com.example.poledigitalacademypda.Repository.Implementation.UserRepositoryImpl" %>
<%@ page import="com.example.poledigitalacademypda.Entities.User" %>
<%@ page import="com.example.poledigitalacademypda.Entities.Role" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<form id="loginform" action="login" method="post">
    <label>username :</label>
    <input type="text" name="email">
    <label>password :</label>
    <input type="password" name="password">
    <input type="submit">
</form>
<br/>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
