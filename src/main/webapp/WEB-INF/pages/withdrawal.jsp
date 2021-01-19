<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	input{
		margin: 10px;
	}
	.f{
		margin-left: 20px;
	}
</style>
<meta charset="UTF-8">
<title>取款成功</title>
</head>
<body>
	<div align="center">
		<table border="0" cellpadding="0" cellspacing="0">
			<tr>
				<th align="center">
					<h3>取款成功，你的余额为：￥${money}</h3>
				</th>
			</tr>
			<tr>
				<td><strong>请选择你的操作:</strong><a href="flag"><input class="f" type="button" value="继续操作"></a><a href="../"><input type="button" value="退出"></a><td>
			</tr>
		</table>
	</div>
</body>
</html>