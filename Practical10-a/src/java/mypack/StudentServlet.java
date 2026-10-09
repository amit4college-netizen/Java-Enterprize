package mypack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);

        StudentDetails details = new StudentDetails();
        details.setPhone(phone);
        details.setCity(city);

        student.setDetails(details);

        Transaction tx = null;

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();

            session.persist(student);

            tx.commit();

            response.sendRedirect("students");

        } catch (Exception e) {

            if (tx != null && tx.isActive()) {
                tx.rollback();
            }

            throw new ServletException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            java.util.List<Student> students =
                    session.createQuery(
                            "from Student", Student.class)
                            .list();

            request.setAttribute("students", students);

            request.getRequestDispatcher("students.jsp")
                    .forward(request, response);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}