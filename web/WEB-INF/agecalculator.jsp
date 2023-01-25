<%-- 
    Document   : agecalculator
    Created on : Jan 24, 2023, 10:04:34 AM
    Author     : alexc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Check Your Age Next Year!</h1>
        <form method="post" action="AgeCalculatorServlet">
            Enter your Age: <input type="text" name="age"><br>
            <p>${test}</p>
            <p>${notInt}</p>
            <input type="submit" value="Age next birthday"><br>
            <a href="arithCalc"> Arithmetic Calculator</a>
        </form>
        
    </body>
</html>
