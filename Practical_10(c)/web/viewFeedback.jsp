<%@ page import="java.util.List" %>
<%@ page import="mypack.Feedback" %>

<!DOCTYPE html>
<html>
<head>
    <title>View Feedback</title>
</head>
<body>

<h2>Student Feedback Records</h2>

<table border="1" cellpadding="10">

<tr>
    <th>ID</th>
    <th>Student Name</th>
    <th>Course</th>
    <th>Feedback</th>
</tr>

<%
List<Feedback> list =
    (List<Feedback>) request.getAttribute("feedbackList");

for (Feedback f : list) {
%>

<tr>
    <td><%= f.getId() %></td>
    <td><%= f.getStudentName() %></td>
    <td><%= f.getCourse() %></td>
    <td><%= f.getMessage() %></td>
</tr>

<%
}
%>

</table>

<br>
<a href="index.jsp">Home</a>

</body>
</html>