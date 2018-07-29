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
					    	<h1 style="text-align: center;">更新账户信息</h1>
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="accountEdit" id="editfrom" method="post">
						 <c:forEach items="${requestScope.account}" var="acc">
							  <div class="form-group">
							    <label for="inputEmail3" class="col-sm-2 control-label">用户编号</label>
							    <div class="col-sm-10">
							      <input type="number" class="form-control" id="inputEmail3" name="accountId" value="${acc.accountId}">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">用户姓名</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="accountName" value="${acc.accountName}">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">用户账户</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="account" value="${acc.account}">
							    </div>
							  </div>
							  
			
							  
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">用户密码</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="accountPass" value="${acc.accountPass}">
							    </div>
							  </div>
							  
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">用户邮箱</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="accountMail" value="${acc.accountMail}">
							    </div>
							  </div>
							   <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label" name="accountPositionId">用户职位</label>
							    <div class="col-sm-10">
								    <select class="form-control" name="accountPositionId">
										    <c:forEach items="${requestScope.poslist}" var="pos">
											  <option value="${pos.getPositionId()}">${pos.getPositionName()}</option>
										    </c:forEach>
								    </select>
							    </div>
							  </div>
							
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label" name="accountDepartmentId">用户部门</label>
							    <div class="col-sm-10">
								    <select class="form-control" name="accountDepartmentId">
										    <c:forEach items="${requestScope.deplist}" var="dep">
											  <option value="${dep.getDepartmentId()}">${dep.getDepartmentName()}</option>
										    </c:forEach>
								    </select>
							    </div>
							  </div>
							  
							 <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label" name="accountRoleId">用户角色</label>
							    <div class="col-sm-10">
								    <select class="form-control" name="accountRoleId">
										   <c:forEach items="${requestScope.rolist}" var="role">
											  <option value="${role.getRoleId()}">${role.getRoleName()}</option>
										    </c:forEach>     
								    </select>
							    </div>
							  </div> 
							  
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label" name="accountCompanyId">用户公司</label>
							    <div class="col-sm-10">
								    <select class="form-control" name="accountCompanyId">
										    <option value="1">中信</option>
											<option value="2">阿里</option>
											<option value="3">百度</option>
								    </select>
							    </div>
							  </div>
							  
							   <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">用户手机</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="accountPhone" value="${acc.accountPhone}">
							    </div>
							  </div>
							  
							   <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">用户电话</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="accountTelephone" value="${acc.accountTelephone}">
							    </div>
							  </div>
							  
							   <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">用户描述</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="accountComment" value="${acc.accountComment}">
							    </div>
							  </div>
							  
							  </c:forEach>
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