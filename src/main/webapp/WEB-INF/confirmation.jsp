<%-- 
    Document   : confirmation
    Created on : Oct 12, 2017, 11:21:52 AM
    Author     : Jonatan
--%>

<%@page import="FunctionLayer.FloorLayOut"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    FloorLayOut list = (FloorLayOut)request.getAttribute("LineItems");
%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brick list</title>
    </head>
    <body>
        <h1>Brick list</h1>
        <%= list.floorLayOut2HTML() %>
        
  
    
</html>
