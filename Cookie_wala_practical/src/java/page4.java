import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;


public class page4 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head><title>Page2</title></head>");
            out.println("<body bgcolor=purple>");
            Cookie chk[]= request.getCookies();
            for(int i=0;i<chk.length;i++){
                if(chk[i].getName().equals("visit")){
    int count = Integer.parseInt(chk[i].getValue()) + 1;
    chk[i].setValue(String.valueOf(count)); // Update cookie value
    response.addCookie(chk[i]);
    out.println("<h1>Visit No : " + count + "</h1>");

                }
                else{
                    out.println(chk[i].getName()+"="+chk[i].getValue());
                }
            } 
                    out.println("<h1 style=color:red;><a href=page5>Click to visit page no.5</a></h1>");
                    
                    
                
                out.println("</body></html>");
            
        }
    }

}
