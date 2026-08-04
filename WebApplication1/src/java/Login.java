/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
       String uname = request.getParameter("txtId");
       String upass = request.getParameter("txtPass");
       if(uname.equals("admin") && upass.equals("123456")){
            out.println("<body bgcolor=blue>");
            out.println("<h1> WelCome !!1 "+uname+"</h1>");
        }else{
           out.println("<body bgcolor=red>"); 
           out.println("<h1> Login Fail !!! </h1>");
        }
       out.println("</body></html>");
    }

    

} }
