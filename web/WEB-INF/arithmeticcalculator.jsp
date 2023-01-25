<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 25, 2023, 9:20:12 AM
    Author     : alexc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="arithCalc">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            <input type="submit" name="math" value="+">
            <input type="submit" name="math" value="-">
            <input type="submit" name="math" value="*">
            <input type="submit" name="math" value="%">
            
            <br>${test}<br>
            
            <br>Results: ${total}<br>
            <a href="AgeCalculatorServlet"> Age Calculator</a>
        </form>
    </body>
</html>
