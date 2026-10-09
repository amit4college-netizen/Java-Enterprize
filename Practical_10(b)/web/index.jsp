<!DOCTYPE html>
<html>
<head>
    <title>Course Management</title>
</head>
<body>

    <h2>Enter Course Details</h2>

    <form action="courses" method="post">

        Course Name:
        <input type="text" name="courseName" required>
        <br><br>

        Duration:
        <input type="text" name="duration" required>
        <br><br>

        Fees:
        <input type="number" name="fees" step="0.01" required>
        <br><br>

        <input type="submit" value="Save Course">

    </form>

    <br>

    <a href="courses">View All Courses</a>

</body>
</html>