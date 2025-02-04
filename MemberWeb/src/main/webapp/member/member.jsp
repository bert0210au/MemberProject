<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>請支援輸贏</title>
<link rel="stylesheet" type="text/css" href="../CSS/style.css">
</head>
<body>
<div class="title"><jsp:include page="/title.jsp"></jsp:include></div>
<div class="content">
			<div style="text-align: center;">
				<br>
				<br>
				<h3>${MemberSession.getName()} 歡迎</h3>
				<a href="../LogoutController">會員登出</a><br>
			</div>
			<table width=400 align=center border=1>
				<tr>
					<td colspan=2 align=center><b>會員資料</b>
				<tr>
					<td width=100 align=center>姓名
					<td>${MemberSession.getName()}
				<tr>
					<td width=100 align=center>帳號
					<td>${MemberSession.getUsername()}
				<tr>
					<td width=100 align=center>地址
					<td>${MemberSession.getAddress()}
				<tr>
					<td width=100 align=center>電話
					<td>${MemberSession.getPhone()}
				<tr>
					<td width=100 align=center>行動
					<td>${MemberSession.getMobile()}
			</table>
</div>
<div class="footer"><jsp:include page="/footer.jsp"></jsp:include></div>
</body>
</html>