
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class ShowResult extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<form action=ShowResult>");
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadb","root","");
           Statement smt =con.createStatement();
           ResultSet res = smt.executeQuery("select ans from quiz");
           out.println("<table border=1>");
           int count=0,qno=0;
           while(res.next()){
               if(res.getString(1).equals(request.getParameter(""+(++qno))))
               {
                   count++;
                   out.println("<h1>Correct</h1>");
               }else{
                       out.println("<h1>Incorrect</h1>");
                       
                       }
           }

        } catch (Exception e){out.println(e);}
        
    }
}
   

