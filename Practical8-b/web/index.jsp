<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body style="background-color: lightblue;">
Sign the Guest Book
<form action="GuestBookView.jsp" method="post">
Visitor Name: <input name="guest" maxlength="25" size="50" />
Message: <textarea rows="5" cols="36" name="message"></textarea>
<input type="submit" name="btnSubmit" value="Submit" />
</form>
</body>
</html>