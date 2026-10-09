package mypack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/save")
public class SaveFeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String message = request.getParameter("message");

        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO feedback " +
                         "(student_name, course, message) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, course);
            ps.setString(3, message);

            ps.executeUpdate();

            response.sendRedirect("success.jsp");

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}