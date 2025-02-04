<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>請支援輸贏</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
<div class="title"><jsp:include page="title.jsp"></jsp:include></div> <!-- 要分幾區就幾個div -->
<div class="content">
<form action="LoginController" method="post">
	<br>
	<br>
	<table width=400 align=center border=1>
		<tr>
			<td colspan=2 align=center><h3>會員登入入口</h3>
		<tr>
			<td width=100 align=center>帳號
			<td align=center><input type="text" name="username">
		<tr>
			<td align=center>密碼
			<td align=center><input type="password" name="password">
		<tr>
			<td colspan=2 align=center>
			<input type="submit" value="送出">

	</table>
</form>
</div>
<div class="footer"><jsp:include page="footer.jsp"></jsp:include></div>
</body>
</html>