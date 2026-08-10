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
                Class.forName("com.mmysql.jdbc.Driver")
            }
            %>
    </body>
</html>
