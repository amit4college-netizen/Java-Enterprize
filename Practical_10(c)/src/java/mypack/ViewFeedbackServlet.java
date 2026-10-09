package mypack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;
import java.util.*;

@WebServlet("/view")
public class ViewFeedbackServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        List<Feedback> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM feedback ORDER BY id DESC"
            );

            while (rs.next()) {
                list.add(new Feedback(
                    rs.getInt("id"),
                    rs.getString("student_name"),
                    rs.getString("course"),
                    rs.getString("message")
                ));
            }

            request.setAttribute("feedbackList", list);

            request.getRequestDispatcher("viewFeedback.jsp")
                   .forward(request, response);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}