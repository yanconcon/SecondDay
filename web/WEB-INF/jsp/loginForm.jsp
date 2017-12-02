<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/2 0002
  Time: 上午 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h3>登录</h3>
<br>
<form action="/user/login" method="post">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input type="text" id="loginName" name="loginName"></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="text" id="passWord" name="passWord"></td>
        </tr>

        <tr>
            <td><input type="submit" value="登录" ></td>
        </tr>
    </table>
</form>