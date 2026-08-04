import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LogoutSevlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head><title>Logout Servlet</title></head>");
            out.println("<body>");
            jakarta.servlet.http.HttpSession hs = request.getSession();
            if(hs != null)hs.invalidate();
            out.println("<h1>You are logged out now .....</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   

}
