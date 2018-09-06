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
</head>
<body>


<div class="row clearfix">


    <div class="container">
        <%--<div class="col-md-8">--%>

        <table class="table table-striped" style="table-layout: fixed;">
            <caption>
                <h1 align="center">文章列表</h1>
            </caption>
            <thead>
            <tr>
                <th>文章名称</th>
                <th>文章内容</th>
                <th>文章分类</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${articleList}" var="list">
                <tr class="active">
                    <td>
                            <%--<fmt:formatDate value="${list.date}" pattern="yyyy年MM月dd日 hh:mm:ss"/>--%>
                            ${list.articleTitle}
                    </td>
                    <td>
                            <%--${fn:substring(list.message,0,15)}--%>
                            ${list.category}
                    </td>
                    <td>
                        ${fn:substring(list.articleContent,0,20)}
                    </td>
                    <td>
                        <a href="/queryArticleById/${list.id}">详情</a>
                        <a href="/deleteArticleById/${list.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>

    <%--</div>--%>

</div>
</body>
</html>

