<%--
  Created by IntelliJ IDEA.
  User: zr
  Date: 2024/2/28
  Time: 8:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/editUsers">
    <table>
        <tr>
            <td>选择</td>
            <td>用户名</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="userList[0].uid" value="1"></td>
            <td><input type="text" name="userList[0].uname" value="张三"></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="userList[1].uid" value="2"></td>
            <td><input type="text" name="userList[1].uname" value="李四"></td>
        </tr>

    </table>
    <input type="submit" value="删除">
</form>
</body>
</html>
