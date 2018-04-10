<%--
  Created by IntelliJ IDEA.
  User: Mc PC
  Date: 2018/1/13
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>"登录"</title>
</head>
<body>
<h3>登录页面</h3>
    <br>
<form action="login" method="post">
    <table>
        <tr>
            <td>loginname:</td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr><td><input type="submit" id="submit" value="登录"></td></tr>
    </table>

</form>
</body>
</html>
