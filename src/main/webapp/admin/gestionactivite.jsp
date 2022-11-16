<%@ page import="com.example.poledigitalacademypda.Services.AdminService" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.poledigitalacademypda.Entities.Activity" %><%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 11/15/2022
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<% if(request.getSession().getAttribute("role")!="admin"){--%>
<%--   response.sendRedirect("/");--%>
<%--}%>--%>
<%--<%! AdminService adminService = new AdminService();%>--%>
<%--<% List<Activity> activities = adminService.showAllActivties();%>--%>

<p>Activities</p>
<table>
    <tr>
        <th>title</th>
        <th>description</th>
        <th>manager name</th>
    </tr>
<%--    <% for(int i=0;i<activities.size();i++){ %>--%>
<%--    <tr>--%>
<%--        <td><%= activities.get(i).getTitle() %></td>--%>
<%--        <td><%= activities.get(i).getDescription() %></td>--%>
<%--        <td><%= activities.get(i).getManager().getFname()  %></td>--%>
<%--    </tr>--%>
<%--    <% } %>--%>
</table>
<form>
    <label>title</label>
    <input name="title">
    <label>description</label>
    <input name="description">
    <label>manager id:</label>
    <input name="manager_id">
    <input name="submit">
</form>
</body>
</html>
