package counter.ejb;

import jakarta.ejb.Stateless;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Stateless
public class MarksBean {

    private String url = "jdbc:mysql://localhost:3306/marksdb";
    private String user = "root";
    private String password = "";

    public void addMarks(String name, String subject, int marks) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, user, password);

            String sql = "INSERT INTO marks (student_name, subject, marks) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, subject);
            ps.setInt(3, marks);

            ps.executeUpdate();

            ps.close();
            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}