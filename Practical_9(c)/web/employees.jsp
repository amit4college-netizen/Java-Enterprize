<%@ page import="java.util.List" %>
<%@ page import="mypack.Employee" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Records</title>
</head>
<body>

<h2>Employee Details</h2>

<table border="1" cellpadding="10">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Department</th>
    <th>Salary</th>
</tr>

<%
List<Employee> employees =
    (List<Employee>) request.getAttribute("employees");

for (Employee e : employees) {
%>

<tr>
    <td><%= e.getId() %></td>
    <td><%= e.getName() %></td>
    <td><%= e.getDepartment() %></td>
    <td><%= e.getSalary() %></td>
</tr>

<%
}
%>

</table>

<br>

<a href="index.jsp">Add Employee</a>

</body>
</html>