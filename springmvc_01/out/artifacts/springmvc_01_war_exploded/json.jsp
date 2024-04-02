<%--
  Created by IntelliJ IDEA.
  User: wuyutong
  Date: 2024/4/1
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.5.0.min.js"></script>

    <script>
        function testJson(){
            //获取用户输入的用户名和密码
            let uname = $("#uname").val();
            let upwd = $("#pwd").val();
$.ajax({
   type:"POST", //请求类型
   url:"${pageContext.request.contextPath}/testJson2", //请求地址
    //将一个 JavaScript 对象或值转换为 JSON 字符串
    data:JSON.stringify({uname:uname,upwd:upwd}),
   contentType:"application/json;charset=UTF-8", //编码格式
   dataType:"json",
    success:function (data){
       console.log(data);
       if(data != null)
        alert("用户名：" + data.uname + "密码：" + data.upwd);
    }
});
        }
    </script>
</head>
<body>
<form>
    用户名：<input type="text" name="uname"/>  <br/>
    密码：<input type="password" name="upwd"/> <br/>
    <input type="button" value="json 测试数据" onclick="testJson()">
</form>
</body>
</html>
