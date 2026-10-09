<%@ page import="java.util.List" %>
<%@ page import="mypack.Course" %>

<!DOCTYPE html>
<html>
<head>
    <title>Course List</title>
</head>
<body>

<h2>Course Details</h2>

<table border="1" cellpadding="10">

    <tr>
        <th>ID</th>
        <th>Course Name</th>
        <th>Duration</th>
        <th>Fees</th>
    </tr>

    <%
        List<Course> courses =
            (List<Course>) request.getAttribute("courses");

        for (Course c : courses) {
    %>

    <tr>
        <td><%= c.getId() %></td>
        <td><%= c.getCourseName() %></td>
        <td><%= c.getDuration() %></td>
        <td><%= c.getFees() %></td>
    </tr>

    <% } %>

</table>

<br>

<a href="index.jsp">Add New Course</a>

</body>
</html>