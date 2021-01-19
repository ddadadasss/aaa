	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>信息</title>
<style type="text/css">
	body {
		font-size: 18px;
	}
	.on{
		color: red;
		font-weight: 700;
	}
	.yes{
		color: green;
		font-weight: 700;
	}
	.r{
		font-weight: 700;
		text-align: right;
		font-size: 24px;
	}
	
</style>
</head>
<body>
	<div align="center">
		<table align="center">
			<tr align="center"><th colspan="2"><h1>详细信息</h1><th></tr>
			<tr>
				<td class="r">卡号：</td>
				<td>${account.account_number}</td>
			</tr>
			<tr>
				<td align="right" class="r">状态：</td>
				<td class="status">
					<c:if test="${account.account_status eq 0 }"><span class="on">不可用</span></c:if>
					<c:if test="${account.account_status eq 1}"><span class="yes">可用</span></c:if>
					<input value="${account.account_status}"/>
				</td>
			</tr>
			<tr>
				<td align="right" class="r">余额：</td>
				<td>￥<span id="a_money">${account.account_money}</span></td>
			</tr>
			<form action="withdrawal" method="post" class="form" id="form">
			<tr  class="form">
				<td align="right" class="r">取款金额：</td>
				<td>
					<input required="required" name="money" id="money"/><br>
				</td>
			</tr>
			<tr align="center" class="form">
				<td colspan="2"><input type="submit" width="30px" height="150px" value="取款"></td>
			</tr>
			</form>
			<tr align="center" class="button">
				<td colspan="2">
					<a  href="../"><input type="button" value="返回"></a>
				</td>
			</tr>
		</table>
		<span id="resmoney"></span>
	</div>
	<script type="text/javascript" src="../statis/js/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			var status = $(".status input").val()
			$(".button").hide();
			$(".status input").hide();
			if(status=="0"){
				$(".form").hide();
				$(".button").show();
			};
			$("#money").blur(function() {
				var a_money = Number($("#a_money").text());
				var money = Number($("#money").val());
				var reg = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
				if (!reg.test(money)) {
					$("#resmoney").text("取款数值异常！").css({color:"red"});
					return false;
				} else if(a_money<money){
					$("#resmoney").text("取款金额不能大于余额！").css({color:"red"});
					return false;
				} else {
					$("#resmoney").text("");
					return true;
				}
			})
			$("#form").submit(function(){
				if($("#resmoney").text()==""){
					return true;
				} else {
					return false
				}
			});
		})
	</script>
</body>
</html>