<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setAttribute("basePath", basePath);
%> 
<!DOCTYPE html>
<html>
<head>
	<title>邮件信息显示</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="${basePath}/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="${basePath}/js/jquery-3.2.1.min.js"></script>
	<script src="${basePath}/js/bootstrap.min.js"></script>

	<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

</head>
<body>
	<!-- 顶栏 -->
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 中间主体 -->
	<div class="container" id="content">
		<div class="row">
			<jsp:include page="menu.jsp"></jsp:include> 
			<div class="col-md-10">
				<div class="panel panel-default">
				    <div class="panel-heading">
						<div class="row">
					    	<h1 class="col-md-5">邮件管理</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="queryMailByName" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入收件人姓名" name="emailRecipient"/>
									<span class="input-group-addon btn" onclick="document.getElementById('form1').submit" id="sub">搜索</span>
								</div>
							</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='${basePath}/sm/toAddMail'">
								新增邮件信息
								<sapn class="glyphicon glyphicon-plus"/>
							</button>
						</div>
						<div>
							<p><h>发送成功</h></p></br>
							<p>
								<a href="${basePath}/sm/sendmailList">返回邮件列表</a>|<a href="${basePath}/sm/toMailSend">继续写信</a>
							</p>
						</div>
				    </div>	   
				</div>
			</div>
		</div>
	</div>
	<div class="container" id="footer">
		<div class="row">
			<div class="col-md-12"></div>
		</div>
	</div>
</body>
</html>