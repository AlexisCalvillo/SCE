<%-- 
    Document   : uno
    Created on : Aug 13, 2020, 11:45:24 AM
    Author     : aalex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
          String strA,strB;  
          int a, b, c;
          strA=request.getParameter("opA");
          strB=request.getParameter("opB");
          a=Integer.parseInt(strA);
          b=Integer.parseInt(strB);
          c= a+b;
          response.getWriter().print("<br> <br> La suma de "+ a+ " y "+ b+ " es: " + c);
        %>
    </body>
</html>
