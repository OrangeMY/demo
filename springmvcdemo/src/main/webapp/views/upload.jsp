<%--
  Created by IntelliJ IDEA.
  User: chengmingyang
  Date: 2020/11/20
  Time: 下午3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件页面</title>
</head>
<body>

    <%-- 这里必须配置entype，entype="multipart/form-data"格式表示可以接受二进制文件（图像、音频等） --%>
    <form action="/springmvcdemo_war/test/file" method="post" enctype="multipart/form-data">
        文件选择: <input type="file" name="myfile"/>
        <input type="submit" value="上传">
    </form>

    <h3>我先下载文件</h3>
    <a href="/springmvcdemo_war/test/download?yourFile=favorite.jpg">点击下载文件</a>

</body>
</html>
