<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h1 align="center">SSM框架启动正常！</h1>
<div align="center">
	<form action="test/t">
	<input name="uName">
	<button type="submit">测试A</button>
	</form>
</div>
<div align="center"><a href="test/findUser">测试&数据库</a></div>
<h3 style="margin-left:60%">by <a href="http://www.vipkes.cn">彭珂</a></h3>
</body>
</html>
