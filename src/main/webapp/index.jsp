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
<%
    int count = 0;
    if(count ==0 ){
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        Role role1 = new Role("admin");
        Role role2 = new Role("manager");
        User user = new User("ibrahim","esseddyq","ibrahim@gmail.com","29e38","1234",role1);
        User user2 = new User("jamal","rouj","jamal@gmail.com","29e38","hakawa",role2);
        User user3 = new User("anass","jablah","anas@gmail.com","29e38","wattt",role2);

        userRepository.save(user);
        userRepository.save(user2);
        userRepository.save(user3);
        count++;
    }
%>
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
