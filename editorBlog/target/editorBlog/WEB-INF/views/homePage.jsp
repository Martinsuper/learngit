<%--
  Created by IntelliJ IDEA.
  User: Martin_working
  Date: 2018/9/6
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>queryResultPage</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .input {
            border: 1px solid #cccccc;
            border-radius: 5px;
            height: 250px;
            /*width: 50px; !*必须设置宽度*!*/
            overflow: hidden; /*溢出隐藏*/
            text-overflow: ellipsis;

        }

        a {
            text-decoration: none;
        }
    </style>

    <%--<script type="text/javascript">--%>
        <%--$("#mybtn").click(function () {--%>
            <%--$.ajax({--%>
                <%--type: "POST",   //提交的方法--%>
                <%--url: "${pageContext.request.contextPath}/insertArticle", //提交的地址--%>
                <%--data: $("#myform").serialize(),// 序列化表单值--%>
                <%--async: false,--%>
                <%--error: function (request) {  //失败的话--%>
                    <%--alert("Connection error");--%>
                <%--},--%>
                <%--success: function (data) {  //成功--%>
                    <%--alert(data);  //就将返回的数据显示出来--%>
                    <%--// window.location.href="/queryMessage"--%>
                <%--}--%>
            <%--});--%>
        <%--});--%>
    <%--</script>--%>
</head>
<body>


<div class="row clearfix">

    <div class="container">
        <%--<div class="col-md-8">--%>
        <form id="myform" action="/insertArticle" method="post">
            <input type="text" name="articleTitle" class="form-control" placeholder="文章名称">
            <input type="text" name="category" class="form-control" placeholder="文章分类">
            <textarea name="articleContent" class="form-control"
                      style="resize:none;width:100%;height:500px"></textarea>
            <div align="center">
                <input type="submit" id="mybtn" class="btn btn-success btn-block" value="提交">
            </div>
        </form>
        <%--</div>--%>
    </div>

</div>
</body>
</html>

