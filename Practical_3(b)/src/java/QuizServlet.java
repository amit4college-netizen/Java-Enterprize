
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class QuizServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<form action=ShowResult>");
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadb","root","");
           Statement smt =con.createStatement();
           ResultSet res = smt.executeQuery("select * from quiz");
           out.println("<table border=1>");
           int qno=0;
           while(res.next()){
               qno++;
               out.println("<tr><td>"+res.getString(1)+"</td>");
               out.println("<td>"+res.getString(2)+"</td></tr>");
               out.println("<tr><td><input type='radio' name='"+qno+"' value='"+res.getString(3)+"'>"+res.getString(3)+"</td></tr>");
               out.println("<tr><td><input type='radio' name='"+qno+"' value='"+res.getString(4)+"'>"+res.getString(4)+"</td></tr>");
               out.println("<tr><td><input type='radio' name='"+qno+"' value='"+res.getString(5)+"'>"+res.getString(5)+"</td></tr>");
               out.println("<tr><td><input type='radio' name='"+qno+"' value='"+res.getString(6)+"'>"+res.getString(6)+"</td></tr>");
           }
        } catch (Exception e){out.println(e);}
        out.println("</table>");
        out.println("<input type=reset>");
        out.println("<input type=SUBMIT>");
        out.println("</form>");
    }
}
   

