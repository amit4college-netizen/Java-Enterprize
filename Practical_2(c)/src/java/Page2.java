
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class Page2 extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             out.println("<html><head><title>Servlet Page2</title></head><body>");
             HttpSession hs = request.getSession(false);
             out.println("<h1>Welcome Again on Page No. 2</h1>");
             int visit = (Integer) hs.getAttribute("visit") + 1;
             out.println("<h1>You Visited "+visit+"Times</h1>");
             hs.setAttribute("visit", ""+visit);
             out.println("<h1>Your Session ID "+hs.getId()+"</h1>");
             out.println("<h1>You Logged in at "+new java.util.Date(hs.getCreationTime())+"</h1>");
             out.println("<h1><a href=Page1>Click for Page 1 </a></h1>");
             out.println("<h1><a href=Page3>Click for Page 3 </a></h1>");
             //out.println("<h1><a href=Page4>Click for Page 4 </a></h1>");
             out.println("<h1><a href=LogoutServlet>Click for Terminate Session </a></h1>");
             out.println("</body>");
             out.println("</html>");
        }
    }

    

}
