<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setAttribute("basePath", basePath);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>职位修改</title>
<link href="${basePath}css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript">
	window.onload = function() {
		var positionName = document.getElementById("positionName");
		var positionName_span = document.getElementById("positionName_span");
		/* var updateName = document.getElementById("updateName");
		var updateName_span = document.getElementById("updateName_span"); */
		var form=document.getElementById("form");
		var button=document.getElementById("button");
		var flag=false;
		positionName.onblur = function() {
			if ("" == positionName.value.trim() || null == positionName.value) {
				positionName_span.style.display = "inline-block";
				positionName_span.innerHTML = "职位名称不得为空！";
				flag = false;
			} else {
				positionName_span.style.display = "none";
				flag = true;
			}

		}
		/* updateName.onblur = function() {
			if ("" == updateName.value.trim() || null == updateName.value) {
				updateName_span.style.display = "inline-block";
				updateName_span.innerHTML = "修改人名不得为空！";
				flag = false;
			} else {
				updateName_span.style.display = "none";
				flag = true;
			}

		} */
		button.onclick= function(){
			if(flag==true){
				alert("修改成功！");
				form.submit();
			}
			else
				alert("修改失败！");
		}
	}
</script>	
</head>
<body>
	<form class="form-horizontal col-lg-offset-4"
	 action="${basePath}sm/positionUpdate1?positionid=${position.positionId}&page=${page}"
	 id="form"
		 method="post">
		<h3>Position Edit</h3>
		<br><br><br><br>
		
		<div class="form-group">
			<label class="col-lg-2 control-label">职位编号：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="positionid" id="positionid"
					value="${position.positionId}" readonly="readonly" >
					
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-2 control-label">职位名称：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="positionName" id="positionName"
					value="${position.positionName}" >	
					<span id="positionName_span"
					style="display: none; color: red"></span>	
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-lg-2 control-label">职位描述：</label>
			<div class="col-lg-4">
				<textarea class="form-control" name="positionComment" value="${position.positionComment}"></textarea>	
			</div>
		</div>
		<!-- <div class="form-group">
			<label class="col-lg-2 control-label">修改人名：</label>
			<div class="col-lg-4">
				<input type="text" class="form-control" name="positionUpdatedName" id="updateName"
				placeholder="请输入修改人名" required="required" >
				 <span id="updateName_span"
					style="display: none; color: red"></span>
			</div>
		</div> -->
		<br>
		<div class="form-group">
			<div class="col-lg-4 col-lg-offset-2">
				<input type="button" value="提交"  class="btn btn-danger" id="button">
				&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; 
				<input type="reset" value="重置"name="reset" class="btn btn-danger">
			</div>
		</div>
	</form>
</body>
</html>