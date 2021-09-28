<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2021, 2:45:19 PM
    Author     : 794974
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style/style_sheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="box">
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <div> 
                <label> First: </label>
                <input type="text" name="first" value="${place_first}">
            </div>
            <div>
               <label> Second: </label>
               <input type="text" name="second" value="${place_second}"> 
            </div>
            <br>
            <div>
                <input type="submit" name="operator" value="+"></input>
                <input type="submit" name="operator" value="-"></input>
                <input type="submit" name="operator" value="*"></input>
                <input type="submit" name="operator" value="%"></input>
            </div>
            <br>
            <div>
                Result: 
                ${message}
            </div>
            <div>
                <p> <a href="age"> Age Calculator</a></p>
            </div>
        </form>
    </body>
</html>
