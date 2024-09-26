<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/25/2024
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .login {
            height:180px; width:230px;
            margin:0;
            padding:10px;
            border:1px #CCC solid;
        }
        .login input {
            padding:5px; margin:5px
        }
    </style>
</head>
<body>
    <from action="/controller" method="post">
        <div class="login">
            <h2>Đăng nhập</h2>
            <input type="text" name="usename" size="20" placeholder=usename />
            <input type="password" name="password" size="20" placeholder="password" />
            <input type="submit" value="Sign in" />
        </div>
    </from>
</body>
</html>
