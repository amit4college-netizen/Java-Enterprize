<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>

    <h2>Student Registration Form</h2>

    <form action="students" method="post">

        Student Name:
        <input type="text" name="name" required>
        <br><br>

        Email:
        <input type="email" name="email" required>
        <br><br>

        Phone:
        <input type="text" name="phone" required>
        <br><br>

        City:
        <input type="text" name="city" required>
        <br><br>

        <input type="submit" value="Save Student">

    </form>

    <br>

    <a href="students">View Students</a>

</body>
</html>