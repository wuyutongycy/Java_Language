<%--
  Created by IntelliJ IDEA.
  User: zr
  Date: 2024/3/27
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findStudentWithClass">
    学生编号：<input type="text" name="sid"/>  <br/>
    班级名称：<input type="text" name="classroom.cname"/> <br/>
    <input type="submit" value="查询">
</form>
</body>
</html>
