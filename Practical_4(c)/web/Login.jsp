<%-- 
    Document   : Login
    Created on : 05-Aug-2026, 10:28:35 am
    Author     : Nirmal
--%>

<%@page contentType="text/html" import="java.sql.*"%>
<html><body>
<h1>Registration JSP Page</h1>
<%
 String uname=request.getParameter("txtName");
 String pass = request.getParameter("txtPass");
 try{
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "");
 PreparedStatement stmt = con.prepareStatement("select password from user where username=?");
 stmt.setString(1, uname);
 ResultSet rs = stmt.executeQuery();
 if(rs.next()){
 if(pass.equals(rs.getString(1)))
 {
 out.println("<h1>~~~ LOGIN SUCCESSFULLL ~~~ </h1>");
 }
 }
 else{
 out.println("<h1>User Name not exist !!!!!</h1>");
 %>
<jsp:include page="Register.html" ></jsp:include>
<%
 }
 }catch(Exception e){out.println(e);}
 %>
</body></html>

