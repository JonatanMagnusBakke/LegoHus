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
        <title>Orders</title>
    </head>
    <body>
        <h1>LegoHouse Orders</h1>
        <%
            for(int i = 0; i < list.size() ; i++){
        %>
        <form action="FrontController" method="POST">
            <input type="hidden" name="command" value="ShowOrders">
            <input type="hidden" name="orderId" value="<%= list.get(i).getId() %>">
            <%= list.get(i).toString() %> <br>
            <input type="submit" value="Close">
        </form>
        
        
        <%
            }
        %>
    </body>
</html>
