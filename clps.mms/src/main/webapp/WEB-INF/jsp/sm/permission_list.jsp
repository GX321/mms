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
	<title>权限信息显示</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="${basePath}css/bootstrap.min.css">
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
					    	<h1 class="col-md-5">权限管理</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="queryPermissionByName" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入权限名称" name="permissionName">
									<span class="input-group-addon btn" id="sub">查询</span>
								</div>
							</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='toAddPermission'">
								新增权限信息
								<sapn class="glyphicon glyphicon-plus"/>
							</button>

						</div>
				    </div>
				    <table class="table table-bordered">
					        <thead>
					            <tr>
					                <th>序号</th>
				  					<th>权限名称</th>
				  					<th>创建人姓名</th>
				  					<th>修改人姓名</th>
				  					<th>修改时间</th>
				  					<th>描述</th>
				  					<th>操作</th>
					            </tr>
					        </thead>
					        <tbody>
							<c:forEach  items="${permissions}" var="permission" varStatus="stauts">
								<tr>
								    <td>${stauts.count}</td>
									<td>${permission.permissionName}</td>
									<td>${permission.permissionCreatedName}</td>
									<td>${permission.permissionUpdatedName}</td>
									<td><fmt:formatDate value="${permission.permissionUpdatedDatetime}" pattern="yyyy-MM-dd hh:mm:ss" /></td>
									<td>${permission.permissionComment}</td>
									<td>
										<button class="btn btn-default btn-xs btn-info" onClick='updated("${basePath}/sm/toUpdatePermission?permissionId=${permission.permissionId}")'>编辑</button>
										<button class="btn btn-default btn-xs btn-danger btn-primary" onClick='deleted("${basePath}/sm/delPermission?permissionId=${permission.permissionId}")'>删除</button>
										<!--弹出框-->
									</td>
								</tr>
							</c:forEach>
					        </tbody>
				    </table>
				    <div class="panel-footer">
						<c:if test="${pagingVO != null}">
							<nav style="text-align: center">
								<ul class="pagination">
									<li><a href="permissionList?page=${pagingVO.upPageNo}">&laquo;上一页</a></li>
									<li class="active"><a href="">${pagingVO.curentPageNo}</a></li>
									<c:if test="${pagingVO.curentPageNo+1 <= pagingVO.totalCount}">
										<li><a href="permissionList?page=${pagingVO.curentPageNo+1}">${pagingVO.curentPageNo+1}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+2 <= pagingVO.totalCount}">
										<li><a href="permissionList?page=${pagingVO.curentPageNo+2}">${pagingVO.curentPageNo+2}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+3 <= pagingVO.totalCount}">
										<li><a href="permissionList?page=${pagingVO.curentPageNo+3}">${pagingVO.curentPageNo+3}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+4 <= pagingVO.totalCount}">
										<li><a href="permissionList?page=${pagingVO.curentPageNo+4}">${pagingVO.curentPageNo+4}</a></li>
									</c:if>
									<li><a href="permissionList?page=${pagingVO.totalCount}">最后一页&raquo;</a></li>
								</ul>
							</nav>
						</c:if>
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
		$("#nav li:nth-child(2)").addClass("active");

        function updated(ups) {
            var msg = confirm("您真的确定要编辑吗？！");
            if (msg==true){
            	location.href=ups;
            }else{
                return false;
            }
        };

        function deleted(ups) {
            var msg = confirm("您真的确定要删除吗？！");
            if (msg==true){
            	location.href=ups;
            }else{
                return false;
            }
        };

        $("#sub").click(function () {
            $("#form1").submit();
        });
	</script>
</html>