import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;



public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head>");
            out.println("<title>Servelt LoginServelet</title></head>");
            String uname = request.getParameter("user");
            String pass = request.getParameter("pass");
            if(uname.equals("Admin")&&pass.equals("12345")){
                RequestDispatcher rd = request.getRequestDispatcher("welcome");
                rd.include(request, response);
            }
            else{
            out.println("<body bgcolor=red>");
            out.println("<h1>Login Fail !!!</h1>");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request, response);
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

}
