<%--
  Created by IntelliJ IDEA.
  User: zr
  Date: 2024/3/26
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/registUser">
        用户名：<input type="text" name="uname"/>  <br/>
        密码：<input type="password" name="upwd"/> <br/>
        <input type="submit" value="注册">
    </form>
</body>
</html>
