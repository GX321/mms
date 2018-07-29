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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="${basePath}css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript">
	window.onload = function() {
		var departmentName = document.getElementById("departmentName");
		var departmentName_span = document.getElementById("departmentName_span");

		var flag=false;
		departmentName.onblur = function() {
			if ("" == departmentName.value.trim() || null == departmentName.value) {
				departmentName_span.style.display = "inline-block";
				departmentName_span.innerHTML = "名称不得为空！";
				flag = false;
			} else {
				departmentName_span.style.display = "none";
				flag = true;
			}

		}
	
			function checkForm() {
			
			return flag;
		}
	}
</script>	
</head>
<body>
	
	<form class="form-horizontal col-lg-offset-4"
	 action="${basePath}sm/departmentadd"
		 method="post" onsubmit="return checkForm()">
		<h3>Department Add</h3>
		<br><br><br><br>

		
		<div class="form-group">
			<label class="col-lg-2 control-label">部门名称：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentName" id="departmentName"
					placeholder="请输入部门名称" required="required" >
					 <span id="departmentName_span"
					style="display: none; color: red"></span>
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-2 control-label">创建人名：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentCreatedName" id="createName"
				placeholder="请输入创建人名" required="required" >
				 
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-lg-2 control-label">上级部门：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="departmentSuperior" id="departmentSuperior"
				placeholder="请出入上级部门" required="required" >
				 
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-lg-2 control-label">部门描述：</label>
			<div class="col-lg-4">
				<textarea class="form-control" name="departmentIntroduction"></textarea>
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