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
        <%= list.get(i).toString() %>
        <form name="PlaceOrder" action="FrontController" method="POST">
            <input type="hidden" name="command" value="PlaceOrder">
            <input type="hidden" name="length" value="<%= list.get(i).getLegohouselength() %>">
            <input type="hidden" name="width" value="<%= list.get(i).getLegohousewidth() %>">
            <input type="hidden" name="height" value="<%= list.get(i).getLegohouseheigth() %>">
            <input type="submit" value="Brick list">
        </form>
        
        <form action="FrontController" method="POST">
            <input type="hidden" name="command" value="ShowOrders">
            <input type="hidden" name="orderId" value="<%= list.get(i).getId() %>">
            
            <input type="submit" value="Close">
        </form>
        
        
        <%
            }
        %>
    </body>
</html>
