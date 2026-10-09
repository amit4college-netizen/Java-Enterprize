<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<body style="background-color: pink;">

<h2>Department and Employee Details</h2>

<form action="View.jsp" method="post">

Department Name:
<input type="text" name="deptName" required />

<br><br>

Employee Name:
<input type="text" name="empName" required />

<br><br>

<input type="submit" name="btnSubmit" value="Submit" />

</form>

</body>
</html>