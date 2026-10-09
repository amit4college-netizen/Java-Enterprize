package mypack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String name = request.getParameter("name");
        String department = request.getParameter("department");
        double salary = Double.parseDouble(
            request.getParameter("salary")
        );

        Employee emp = new Employee(name, department, salary);

        try (Session session = HibernateUtil.getFactory().openSession()) {

            Transaction tx = session.beginTransaction();

            session.persist(emp);

            tx.commit();
        }

        response.sendRedirect("employees");
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        try (Session session = HibernateUtil.getFactory().openSession()) {

            List<Employee> employees =
                session.createQuery("from Employee", Employee.class).list();

            request.setAttribute("employees", employees);

            request.getRequestDispatcher("employees.jsp")
                   .forward(request, response);
        }
    }
}