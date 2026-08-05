
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;


public class page1 extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           out.println("<html><head><title>Page1</title></head>");
           out.println("<body bgcolor=pink>");
           String uname = request.getParameter("txt1");
           //out.println("<h1><a href=page2>Click to visit page</a></h1>");
           out.println("<h1>Welcome "+uname+"</h1>");
           Cookie chk1 = new Cookie("User", uname);
           Cookie chk2 = new Cookie("visit", "1");
           response.addCookie(chk1);
           response.addCookie(chk2);
           out.println("<h1><a href=page2>Click to visit page no.2</a></h1>");
           out.println("</body>");
           out.println("</html>");
           
        }
    }
}

    