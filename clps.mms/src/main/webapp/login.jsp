<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<html>
<head>
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=basePath%>/js/bootstrap.min.js"></script>
	<style type="text/css">
	body{
	   background: url(images/a.jpg)repeat;
	}
	#login-box {
		/*border:1px solid #F00;*/
		padding: 35px;
		border-radius:15px;
		background: #56666B;
		color: #fff;
	}

	</style>
</head>
<body>
	<div class="container" id="top">
		<div class="row" style="margin-top: 280px; ">
			<div class="col-md-4"></div>
			<div class="col-md-4" id="login-box">
				<form class="form-horizontal" role="form" action="login/doLogon" id="from1" method="post" >
				  <div class="form-group">
				    <label for="firstname" class="col-sm-3 control-label">账户</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="account" placeholder="请输入名字" name="account">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="lastname" class="col-sm-3 control-label">密码</label>
				    <div class="col-sm-9">
				      <input type="password" class="form-control" id="password" placeholder="请输入密码" name="password">
				    </div>
				  </div>
				  <%--<div class="form-group">--%>
				    <%--<div class="col-sm-offset-2 col-sm-10">--%>
				      <%--<div class="checkbox">--%>
				        <%--<label class="checkbox-inline">--%>
							<%--<input type="radio" name="role" value="1" checked>管理员--%>
						<%--</label>--%>
						<%--<label class="checkbox-inline">--%>
							<%--<input type="radio" name="role" value="2">老师--%>
						<%--</label>--%>
						<%--<label class="checkbox-inline">--%>
							<%--<input type="radio" name="role" value="3">学生--%>
						<%--</label>--%>
				      <%--</div>--%>
				    <%--</div>--%>
				  <%--</div>--%>
				  <br>
				    <div style="margin-left:150px"><a href="<%=basePath%>/sm/addview" style="text-decoration:none">注册</a>&nbsp;&nbsp;<a href="" style="text-decoration:none">忘记密码</a><br></div>
				
				  <div class="form-group pull-right" style="margin-top:10px;margin-right: 95px;">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-default btn-info">登录</button>
				    </div>
				  </div>
				</form>
			</div>
			<div class="col-md-4"></div>
		</div>		
	</div>
</body>
</html>