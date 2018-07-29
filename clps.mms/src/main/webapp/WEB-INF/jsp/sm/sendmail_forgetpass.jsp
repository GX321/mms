<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath", basePath);
%> 
<!DOCTYPE html>
<html>
<head>
	<title>密码找回</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=basePath%>/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- 中间主体 -->
		<div class="container" id="content">
		<div class="row">
			
			<div class="col-md-10">
				<div class="panel panel-default">
				    <div class="panel-heading">
						<div class="row">
					    	
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="${basePath}/sm/forget" id="editfrom" method="post">
							  <div class="form-group">
							    <label for="inputEmail3" class="col-sm-2 control-label">账户名称</label>
							    <div class="col-sm-10">
							       <input type="text"  class="form-control" name="account" required="required" placeholder="请输入账户名称"/>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">邮箱地址</label>
							    <div class="col-sm-10">
							      <input type="text"  class="form-control" name="email" required="required" placeholder="请输入邮箱地址"/>
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