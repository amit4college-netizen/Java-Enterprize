<%-- 
    Document   : index
    Created on : 15-Jul-2026, 9:53:30 am
    Author     : Nirmal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Use of intrustic objects JSP</h1>
        <h1>Request Object</h1>
        Query String <%=request.getQueryString()%> <br>
        Context path <%=request.getContextPath()%> <br>
        Remote Host  <%=request.getRemoteHost()%> <br>
        <h1>Response object</h1>
        Character Encoding <%=request.getCharacterEncoding()%> <br>
        Content type <%=request.getContentType()%> <br>
        Locale <%=request.getLocale()%> <br>
        <h1>Session Object</h1>
        Id : <%=session.getId()%><br>
        Creation time : <%=new java.util.Date(session.getCreationTime())%><br>
        Last Access Time <%=new java.util.Date(session.getLastAccessedTime())%>
                
    </body>
</html>
