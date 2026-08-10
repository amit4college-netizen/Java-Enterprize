<%-- 
    Document   : UpdateEmp
    Created on : 06-Aug-2026, 9:59:56 am
    Author     : Nirmal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1>Employee Record Update</h1>
        <%
            String eno = request.getParameter("txtEno");
            String name= request.getParameter("txtName");
            String age = request.getParameter("txtAge");
            String sal = request.getParameter("txtSal");
                try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
                PreparedStatement stmt = con.prepareStatement("select * from emp where empid=?");
                stmt.setString(1,eno);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                out.println("<h1>~~~Employee "+name+"Exit ~~~</h1>");
                PreparedStatement pst1 = con.prepareStatement("update emp set salary=? where empid=?");
                PreparedStatement pst2 = con.prepareStatement("update emp set age=? where empid=?");
                pst1.setString(1, sal);pst1.setString(2,eno);
                pst2.setString(1, age);pst2.setString(2,eno);
                pst1.executeUpdate();
                pst2.executeUpdate();}
                else{
                out.println("<h1>Employee Record does not exist!!!!!</h1>");
            }
            }catch(Exception e){
            out.println(e);
            }
            
            %>
    </body>
</html>
