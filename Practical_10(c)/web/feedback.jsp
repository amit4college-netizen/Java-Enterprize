<!DOCTYPE html>
<html>
<head>
    <title>Submit Feedback</title>
</head>
<body>

<h2>Student Feedback Form</h2>

<form action="save" method="post">

    Student Name:
    <input type="text" name="name" required>
    <br><br>

    Course:
    <select name="course" required>
        <option value="BSc IT">BSc IT</option>
        <option value="BSc CS">BSc CS</option>
        <option value="BCom">BCom</option>
        <option value="BA">BA</option>
    </select>
    <br><br>

    Feedback:
    <textarea name="message" required></textarea>
    <br><br>

    <input type="submit" value="Submit Feedback">

</form>

<br>
<a href="index.jsp">Home</a>

</body>
</html>