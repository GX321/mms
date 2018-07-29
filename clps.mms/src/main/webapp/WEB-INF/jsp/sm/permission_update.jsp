<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>


<!DOCTYPE html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setAttribute("basePath", basePath);
%>
<html>
<head>
	<title></title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="${basePath}css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="${basePath}js/jquery-3.2.1.min.js"></script>
	<script src="${basePath}js/bootstrap.min.js"></script>
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
					    	<h1 style="text-align: center;">编辑权限信息</h1>
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="updatePermission" id="editfrom" method="post">
							  <div class="form-group ">
							    <label for="inputEmail3" class="col-sm-2 control-label" >序号</label>
							    <div class="col-sm-10">
							      <input readonly="readonly" type="number" class="form-control" id="inputEmail3" name="permissionId" placeholder="请输入编号"
								  <c:if test='${permission!=null}'>
										 value="${permission.permissionId}"
								  </c:if>>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">权限名称</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="permissionName" placeholder="请输入姓名" value="${permission.permissionName}">
							    </div>
							  </div>
					  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">创建人姓名</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="permissionCreatedName" placeholder="请输入姓名" value="${permission.permissionCreatedName}">
							    </div>
							  </div>					  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">修改人姓名</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="permissionUpdatedName" placeholder="请输入姓名" value="${permission.permissionUpdatedName}">
							    </div>
							  </div>					  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">描述</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="permissionComment" placeholder="描述" value="${permission.permissionComment}">
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