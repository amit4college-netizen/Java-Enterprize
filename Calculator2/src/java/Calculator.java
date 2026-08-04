

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class Calculator extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
           out.println("<html><head><title>Servlet Calculator</title></head><body>");
            double n1= Double.parseDouble(request.getParameter("txt1"));
            double n2= Double.parseDouble(request.getParameter("txt2"));
            double result = 0;
            String opr = request.getParameter("operator");
            if(opr.equals("+")) result=n1+n2;   if(opr.equals("-")) result=n1-n2;
            if(opr.equals("*")) result=n1*n2;   if(opr.equals("/")) result=n1/n2;
            out.println("<h1> Result = " + result); out.println("</body></html>");
        }
    }
}
