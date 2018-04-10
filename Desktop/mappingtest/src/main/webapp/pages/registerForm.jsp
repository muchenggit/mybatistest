<%--
  Created by IntelliJ IDEA.
  User: Mc PC
  Date: 2018/1/13
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <h3>注册页面</h3>
    <br>
    <form action="register" method="post">
        <table>
            <tr>
                <td>Loginname:</td>
                <td><input type="text" id="loginname" name="looginname"></td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input type="password" id="password" name="password"></td>
            </tr>
            <tr>
                <td>username</td>
                <td><input type="text" id="username" name="username"></td>
            </tr>
            <tr>
                <td><input id="submint" type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</body>
</html>
