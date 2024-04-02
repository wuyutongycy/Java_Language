<%--
  Created by IntelliJ IDEA.
  User: zr
  Date: 2024/3/27
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findCourse">
    <table>
        <tr>
            <td>课程名</td>
            <td>选择</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="ids" value="1"></td>
            <td>SSM 框架技术</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="ids" value="2"></td>
            <td>Java 程序设计</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="ids" value="3"></td>
            <td>C 程序设计</td>
        </tr>
    </table>
    <input type="submit" value="删除">
</form>
</body>
</html>
