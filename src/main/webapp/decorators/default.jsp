<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html lang="zh-cmn-Hans">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>
        <sitemesh:write property="title"/>
    </title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="renderer" content="webkit"/>
    <sitemesh:write property="head"/>
    <link rel="stylesheet" type="text/css" href="/static/css/web.css"/>
    <script type="text/javascript" src="/static/js/web.js"></script>
</head>
<body>
<sitemesh:write property="body"/>
<br>
在装饰器使用EL表达式获取model中的属性:
<br>
${date}
</body>
</html>