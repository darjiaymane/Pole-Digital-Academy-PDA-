<%@ page import="com.example.poledigitalacademypda.Services.AdminService" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.poledigitalacademypda.Entities.Activity" %>
<%@ page import="com.example.poledigitalacademypda.Services.ManagerService" %>
<%@ page import="com.example.poledigitalacademypda.Entities.Manager" %>
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
//    if(request.getSession().getAttribute("role")!="admin"){
//   response.sendRedirect("/");
//}
<%
%>
<%! AdminService adminService = new AdminService();%>
<%! ManagerService managerService = new ManagerService();%>

<% List<Activity> activities = adminService.showAllActivties();%>

<p>Activities</p>
<table>
    <tr>
        <th>title</th>
        <th>description</th>
        <th>manager name</th>
    </tr>
    <% for(int i=0;i<activities.size();i++){ %>
    <tr>
        <td><%= activities.get(i).getId() %></td>

        <td><%= activities.get(i).getTitle() %></td>
        <td><%= activities.get(i).getDescription() %></td>
        <%--        <td><%= activities.get(i).getManager().getFname()  %></td>--%>
        <td><button><a href="/PDA/deleteactivity?id=<%=activities.get(i).getId()%>">Delete</a></button></td>
        <td><button><a href="?updateid=<%=activities.get(i).getId()%>">Update</a></button></td>

    </tr>
    <% } %>
</table>
<% if(request.getParameter("updateid") != null){
    Integer id = Integer.valueOf(request.getParameter("updateid"));
    Activity activity = adminService.findActivity(id);

%>
<form method="post"  id="form1" name="form1" action="../UpdateActivity">
    <input name="updateid" type="hidden" value="<%=activity.getId()%>">
    <label>title <%=activity.getTitle()%></label>
    <input name="title" value="<%=activity.getTitle()%>">
    <label>description</label>
    <input name="description" value="<%=activity.getDescription()%>">
    <label>manager id:</label>
    <input name="manager_id" value="<%=activity.getManager().getId()%>">
    <input type="submit">
</form>
<%
}

else{
%>
<form id="form2" name="form2" method="post" action="/PDA/addactivity">

    <label>title kjh</label>
    <input name="title">
    <label>description</label>
    <input name="description">
    <label>manager id:</label>
    <input name="manager_id">
    <input type="submit">
</form>
    <%
        }
    %>


%>
</body>
</html>
