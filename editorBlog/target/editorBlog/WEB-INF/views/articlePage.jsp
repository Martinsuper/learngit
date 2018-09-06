<%--
  Created by IntelliJ IDEA.
  User: Martin_working
  Date: 2018/9/6
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>文章界面</title>
</head>
<body>

<%--<c:forEach items="${article}" var="article">--%>
<h1 align="center">${article.articleTitle}</h1>
<p>${article.articleContent}</p>

</body>
</html>
