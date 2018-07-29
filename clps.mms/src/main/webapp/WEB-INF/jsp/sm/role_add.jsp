<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	request.setAttribute("basePath", basePath);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入bootstrap -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/bootstrap.min.css">
<!-- 引入JQuery  bootstrap.js-->
<script src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
<script src="<%=basePath%>/js/bootstrap.min.js"></script>

</head>
<body>
	<!-- 顶栏 -->

	<!-- 中间主体 -->
	<div class="container" id="content">
		<div class="row">

			<div class="col-md-10">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="row">
							<h1 style="text-align: center;">新增账户信息</h1>
						</div>
					</div>
					<div class="panel-body">
						<form action="roleCreate" method="post">
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">
									角色名称:</label> <input type="text" name="roleName" id="roleName"
									placeholder="请输入角色名称" required="required">
							</div>

							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">
									角色组编号:</label><input type="text" name="roleGroupId" id="roleGroupId"
									placeholder="请输入角色组编号" required="required">
							</div>

							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">
									角色组名称:</label><input type="text" name="roleGroupName"
									id="roleGroupName" placeholder="请输入角色组名称" required="required">
							</div>

							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">
									角色修改人:</label><input type="text" name="roleMaker" id="roleMaker"
									placeholder="请输入角色修改人" required="required">
							</div>

							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">
									角色描述:</label><input type="text" name="roleComment" id="roleComment"
									placeholder="请输入角色描述" required="required">
							</div>

							<br>
							<div class="form-group" style="text-align: center">
								<input type="submit" value="提交" name="submit">&nbsp;&nbsp;&nbsp;
								<input type="reset" value="重置" name="reset">
							</div>
						</form>
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
<script type="text/javascript">
	$("#nav li:nth-child(2)").addClass("active")
</script>
</html>