<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html>
<head>
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
					    	<h1 style="text-align: center;">修改菜单信息</h1>
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="${basePath}/sm/Updatemenu" id="editfrom" method="post">
							 
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">名称</label>
									<div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="menuname" value="${menu.menuName}" placeholder="请输入菜单名称">
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">父菜单</label>
									<div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="menuparent" value="${menu.menuParent}" placeholder="请输入父菜单">
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">子菜单</label>
									<div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="menutarget" value="${menu.menuTarget}" placeholder="请输入子菜单">
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">描述</label>
									<div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="menucomment" value="${menu.menuComment}" placeholder="描述">
							    </div>
							  </div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label" name="isvisable">状态</label>
								<div class="col-sm-10">
									<select class="form-control" name="isvisable" id="coursetype" value="${menu.isVisable}">
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
	
</html>