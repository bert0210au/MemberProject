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
				<br>
				<a href="member.jsp">進入會員管理</a><br><br>
				<a href="../LogoutController">會員登出</a><br>
			</div>
			
	</div>
	
<div class="footer"><jsp:include page="/footer.jsp"></jsp:include></div>
</body>
</html>