import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class page extends HttpServlet {

   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        String user=request.getParameter("txt1");
           String pass=request.getParameter("txt2");
           try{
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
           PreparedStatement ps=con.prepareStatement("insert  into logintable values(?,?)");
           ps.setString(1, user);
           ps.setString(2, pass);
           ps.executeUpdate();
           out.println("inserted sucessfullyy.....!!! ");
           
           
           
           
           }
           
           
           
           catch(Exception e)
           {
               out.println(e);
           }
    }

  

}
}