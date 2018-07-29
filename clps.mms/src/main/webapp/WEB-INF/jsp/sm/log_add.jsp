<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html>
<html>
<head>
	<title></title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/bootstrap.min.css">
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
					    	<h1 style="text-align: center;">新增日志信息</h1>
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="saveLog" id="editfrom" method="post">
							  <div class="form-group">
							    <label for="inputEmail3" class="col-sm-2 control-label">日志编号</label>
							    <div class="col-sm-10">
							      <input type="number" class="form-control" id="inputEmail3" name="logId" placeholder="请输入日志编号">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">操作时间</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="logOperationTime" placeholder="请输入操作时间">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">操作人名</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="logOperatorName" placeholder="请输入操作人员">
							    </div>
							  </div>
							  
			
							  
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">操作对象</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="logOperationObject" placeholder="请输入操作对象">
							    </div>
							  </div>
							  
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">操作类型</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="logOperationKind" placeholder="请输入操作类型">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">操作详情</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="logOperationComment" placeholder="请输入操作详情">
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
		$("#nav li:nth-child(2)").addClass("active")
	</script>
</html>