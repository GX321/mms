<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>

<html>
<head>
	<title></title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="${basePath}/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="${basePath}/js/jquery-3.2.1.min.js"></script>
	<script src="${basePath}/js/bootstrap.min.js"></script>
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
						<h1 style="text-align: center;">新增菜单信息</h1>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="/sm/MenuList" id="editfrom" method="post">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">名称</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="inputEmail3" name="menuName" placeholder="请输入菜单名">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">父菜单</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="inputPassword3" name="menuParent" placeholder="请输入父菜单">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">子菜单</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="inputPassword3" name="menuTarget" placeholder="请输入子菜单">
							</div>
						</div>
						
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">描述</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="inputPassword3" name="menuComment" placeholder="">
							</div>
						</div>
										
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label" name="coursetype">状态</label>
							<div class="col-sm-10">
								<select class="form-control" name="isVisiable">
									<option value="不显示">0</option>
									<option value="显示">1</option>
									
								</select>
							</div>
						</div>
						
						<div class="form-group" style="text-align: center">
							<button class="btn btn-default" type="submit">提交</button>
							<button class="btn btn-default" type="reset">重置</button>
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
    $("#nav li:nth-child(1)").addClass("active")
</script>
</html>