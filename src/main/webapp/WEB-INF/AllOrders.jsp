<%-- 
    Document   : AllOrders
    Created on : Oct 12, 2017, 12:24:29 PM
    Author     : Jonatan
--%>

<%@page import="java.util.List"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     List<Order> list = (List<Order>)request.getAttribute("Orders");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for(int i = 0; i < list.size() ; i++){
        %>
        <h1><%= list.get(i).toString() %></h1>
        <%
            }
        %>
    </body>
</html>
