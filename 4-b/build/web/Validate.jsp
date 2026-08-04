<%@page contentType="text/html" pageEncoding="UTF-8" import="mypack.*"%>
<html><head><title>JSP page</title></head>
<body>
    <h1>Validation page</h1>
    <jsp:useBean id="obj" scope="request" class="mypack.CheckerBean">
    <jsp:setProperty name="obj" property="*"/>
    </jsp:useBean>

    <%if (obj.Validate())
    {%>
        <jsp:forward page="successful.jsp"/>
    <%}
    else {%>
        <jsp:include page="index.html"/>
    <%}%>
    <%=obj.getError() %>
</body>
</html>