<!DOCTYPE html>
<html>
<head>
    <title>Employee Management</title>
</head>
<body>

<h2>Enter Employee Details</h2>

<form action="employees" method="post">

    Employee Name:
    <input type="text" name="name" required>
    <br><br>

    Department:
    <input type="text" name="department" required>
    <br><br>

    Salary:
    <input type="number" name="salary" step="0.01" required>
    <br><br>

    <input type="submit" value="Save Employee">

</form>

<br>

<a href="employees">View Employees</a>

</body>
</html>