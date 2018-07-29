<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<link href="${basePath}css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<form class="form-horizontal col-lg-offset-4"
	 action="${basePath}sm/departmentsetupdate"
		 method="post" onsubmit="return checkForm()">
		<h3>Department update</h3>
		<br><br><br><br>
		
		<div class="form-group">
			<label class="col-lg-2 control-label">部门序号：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentId" id="departmentId"
					value=" ${department.departmentId}"  readonly="readonly" >
				
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-2 control-label">部门名称：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentName" id="departmentName"
					value="${department.departmentName}" >	
					
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-2 control-label">部门电话：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentTelephone" value="${department.departmentTelephone}">	
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-lg-2 control-label">部门主管：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentRole"value="${department.departmentRole}">	
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-2 control-label">部门位置：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentAddress" value="${department.departmentAddress}">	
			</div>
		</div>
		
		
		<div class="form-group">
			<label class="col-lg-2 control-label">修改人名：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentUpdatedid" value="${department.departmentUpdatedid}" >
				 
			</div>
		</div>
		<br>
		<div class="form-group">
			<div class="col-lg-4 col-lg-offset-2">
				<input type="submit" value="提交" name="submit" class="btn btn-danger">
				&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; 
				<input type="reset" value="重置"name="reset" class="btn btn-danger">
			</div>
		</div>
	</form>

    
</body>
</html>