<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        
        <h1>Hello <%=request.getParameter( "email")%> </h1>
        <form name="PlaceOrder" action="FrontController" method="POST">
            <input type="hidden" name="command" value="PlaceOrder">
            Length:<br>
            <input type="text" name="length">
            <br>
            Width:<br>
            <input type="text" name="width">
            <br>
            Height:<br>
            <input type="text" name="height">
            <br>
            <input type="submit" value="Submit">
        </form>
        
        <form name="ShowOrders" action="FrontController" method="POST">
            <input type="hidden" name="command" value="ShowOrders">
            Show Orders <br>
            <input type="submit" value="Submit">
        </form>
        
    </body>
</html>
