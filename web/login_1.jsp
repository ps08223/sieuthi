<%-- 
    Document   : login
    Created on : Feb 25, 2019, 8:39:00 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <style type="text/css">
        body {
            text-align: center;
            padding-top: 15px;
            font-variant: small-caps;
            font-size: 17px;
            text-decoration: underline;
            color: brown;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        fieldset {
            width: 450px;
            margin: auto;
            border-radius: 5px;
        }
        .form-control {
            width: 415px;
            border-radius: 5px;
            border: none;
            border: 1px solid grey;
        }
        .form-group {
            padding-bottom: 15px;
        }
        .form-button {
            padding: 8px 30px;
            border-radius: 5px;
            border: none;
            outline: none;
            box-shadow: 0 0 5px black;
            font-weight: bold;
            background-color: white;
        }
        .form-button:hover {
            background-color: brown;
            color: white;
        }
    </style>
</head>
<body>
    <form action="ControllerCartBean">
        <fieldset>  
            <div class="form-group">
                <label for="username">Tài Khoản:</label>
                <input type="text" name="username" class="form-control" style="height: 25px;" />
            </div>
            <div class="form-group">
                <label for="pass">Mật Khẩu:</label>
                <input type="password" name="pass" class="form-control" style="height: 25px;" />
            </div>
            <div class="form-group">
                <input type="submit" value="Login" class="form-button" name="action">
            </div>
        </fieldset>
    </form>
</body>
</html>
