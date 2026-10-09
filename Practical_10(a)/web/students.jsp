<%@page import="java.util.List"%>
<%@page import="mypack.Student"%>

<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>

    <h2>Registered Students</h2>

    <table border="1" cellpadding="10">

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>City</th>
        </tr>

        <%
            List<Student> students =
                (List<Student>) request.getAttribute("students");

            for (Student s : students) {
        %>

        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getDetails().getPhone() %></td>
            <td><%= s.getDetails().getCity() %></td>
        </tr>

        <%
            }
        %>

    </table>

    <br>

    <a href="index.jsp">Add New Student</a>

</body>
</html>