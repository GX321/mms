<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html>
<head>
<title>成功Excel导入</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 引入bootstrap -->
<link rel="stylesheet" type="text/css"
	href="${basePath}css/bootstrap.min.css">
<!-- 引入JQuery  bootstrap.js-->
<script src="${basePath}js/jquery-3.2.1.min.js"></script>
<script src="${basePath}js/bootstrap.min.js"></script>

<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

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
							<h1 class="col-md-5">Excel导入显示</h1>
							<form class="bs-example bs-example-form col-md-5" role="form"
								style="margin: 20px 0 10px 0;" action="positionSelect"
								id="form1" method="post"></form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px"
								onClick="location.href='<%=basePath%>/util/fileUpload'">
								返回主页面<span class="glyphicon glyphicon-plus"></span>
							</button>

						</div>
					</div>
	
		<h3>恭喜，您的导入Excel成功!</h3><br/>
		如需继续导入Excel操作请点击：
		<a href="fileUpload">导入Excel链接</a><br/><br/>
		如需查看Excel和导出Excel操作请点击：
		<a href="fileList">Excel列表链接</a><br />
	</div>
</body>
</html>