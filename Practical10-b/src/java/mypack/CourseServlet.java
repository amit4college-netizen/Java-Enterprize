package mypack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String name = request.getParameter("courseName");
        String duration = request.getParameter("duration");
        double fees = Double.parseDouble(request.getParameter("fees"));

        Course course = new Course(name, duration, fees);

        try (Session session = HibernateUtil.getFactory().openSession()) {

            Transaction tx = session.beginTransaction();
            session.persist(course);
            tx.commit();
        }

        response.sendRedirect("courses");
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        try (Session session = HibernateUtil.getFactory().openSession()) {

            List<Course> courses =
                session.createQuery("from Course", Course.class).list();

            request.setAttribute("courses", courses);

            request.getRequestDispatcher("courses.jsp")
                   .forward(request, response);
        }
    }
}