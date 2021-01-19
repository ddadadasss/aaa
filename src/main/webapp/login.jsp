<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<div align="center">
		<h1>登录</h1>
		<hr>
		<form action="account/index" method="post" id="from">
			卡号：<input name="number" id="name" required="required"/><br><span id="resname"></span><br>
			<br> 密码：<input type="password" name="pwd"  id="pwd" required="required"/><br><span id="respwd"></span><br>
			<br> <input type="submit" value="登录" />
		</form>
	</div>
	<script type="text/javascript" src="statis/js/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#name").blur(function(){
				var number = $(this).val();
				if (!/^\d{16}$/.test(number)){
					$("#resname").text("卡号为16位数字").css({color:"red"});
					return false;
				} else {
					$("#resname").text("");
				}
				
			})
			$("#pwd").blur(function(){
				var pwd = $(this).val();
				if (!/^\d{6}$/.test(pwd)){
					$("#respwd").text("密码为6位数字").css({color:"red"});
				} else {
					$("#respwd").text("");
				}
			})
			$("#from").submit(function(){
				if ($("#respwd").text()==""&&$("#resname").text()=="") {
					return true;
				} else {
					return false;
				}
			})
		})
	</script>
</body>
</html>