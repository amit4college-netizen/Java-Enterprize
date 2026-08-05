

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class SessionPage extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           out.println("<html><head><title>Servlet Page 1</title></head>");
           
           HttpSession hs=request.getSession(true);
           if(hs.isNew()){
               out.println("<body bgcolor=yellow>");
               String name = request.getParameter("txtName");
               hs.setAttribute("uname",name);
               hs.setAttribute("visit",1);
               out.println("<h1>Welcome First Time</h1>");
           }else{
               out.println("<h1>Welcome again</h1>");
               int visit=Integer.parseInt((String)hs.getAttribute("visit"))+1;
               out.println("<h1>You visited "+visit+" Times</h1>");
               hs.setAttribute("visit",""+visit);
           }
           out.println("<h1>Your Session Id "+ hs.getId()+"</h1>");
           out.println("<h1>You Logged in at "+ new java.util.Date(hs.getCreationTime())+"</h1>");
           out.println("<h1><a href=Page2>Click for Page2</a></h1>");
           out.println("<h1><a href=Page3>Click for Page3 </a></h1>");
           out.println("<h1><a href=Page4>Click for Page4 </a></h1>");
           out.println("<h1><a href=LogoutSevlet>Click to terminate</a></h1>");
           out.println("</body></html>");
        }
    }
    
}
           