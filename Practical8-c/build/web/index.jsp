<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<body style="background-color: pink;">

<h2>Enter Book Details</h2>

<form action="BookView.jsp" method="post">

Book Name:
<input name="bookName" maxlength="100" size="50" />

<br><br>

Author:
<input name="author" maxlength="100" size="50" />

<br><br>

Price:
<input type="number" name="price" step="0.01" />

<br><br>

<input type="submit" name="btnSubmit" value="Submit" />

</form>

</body>
</html>