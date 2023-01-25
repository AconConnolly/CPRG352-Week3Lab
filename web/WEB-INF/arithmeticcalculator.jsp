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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="ArithmeticCalculatorServlet">
            First: <input type="text" name="first"><br>
            Second: <input type="text" name="second"><br>
            <input type="submit" id="math" value="+">
            <input type="submit" id="math" value="-">
            <input type="submit" id="math" value="*">
            <input type="submit" id="math" value="%">
            ${test}
            <a href="AgeCalculatorServlet"> Age Calculator</a>
        </form>
    </body>
</html>
