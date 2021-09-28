<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2021, 12:02:00 PM
    Author     : 794974
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style/style_sheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>age</title>
    </head>
    <body class="box">
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <div>
                <label> Enter your age:</label>
                <input type="textbox" name="age" value="">
            </div>
            <div>
                <input type="submit" value="Age next birthday"</input>
            </div>
                
        </form>
        <br>
        ${message}
        
        <p><a href="arithmetic">Arithmetic Calculator</a></p>
    </body>
</html>
