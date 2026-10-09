package mypack;

public class Feedback {

    private int id;
    private String studentName;
    private String course;
    private String message;

    public Feedback(int id, String studentName,
                    String course, String message) {
        this.id = id;
        this.studentName = studentName;
        this.course = course;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public String getMessage() {
        return message;
    }
}