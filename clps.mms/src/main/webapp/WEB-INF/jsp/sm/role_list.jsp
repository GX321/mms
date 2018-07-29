<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	request.setAttribute("basePath", basePath);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function confirmDelete() {
		return confirm("确定删除该角色吗");
	}
	function confirmUpdate() {
		return confirm("确定更新该角色吗");
	}
	function confirmAdd() {
		return confirm("确定添加角色吗");
	}
</script>
<!-- 引入bootstrap -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/bootstrap.min.css">
<!-- 引入JQuery  bootstrap.js-->
<script src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
<script src="<%=basePath%>/js/bootstrap.min.js"></script>
<title>角色显示</title>
</head>
<body>
	<!-- 顶栏 -->
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 中间主体 -->
	<div class="container" id="content">
		<div class="row">
			<div class="col-md-10">
				<div class="panel panel-default">
					<h1 class="col-md-5">角色信息列表</h1>
					<div class="panel-heading">
						<form class="bs-example bs-example-form col-md-5" role="form"
							style="margin: 20px 0 10px 0;" action="roleQuery" id="form1"
							method="post">
							<div class="input-group">
								<input type="text" class="form-control" name="roleId"
									placeholder="请输入角色编号" name="queryRoleById"> <span
									class="input-group-addon btn" id="sub">搜索</span>
							</div>
						</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px"
								onClick="location.href='<%=basePath%>/sm/roleAdd'">
								新增角色 <span class="glyphicon glyphicon-plus"></span>
							</button>
					</div>
				</div>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>角色编号</th>
							<th>角色名称</th>
							<th>角色组编号</th>
							<th>角色组名称</th>
							<th>角色更新时间</th>
							<th>角色修改人</th>
							<th>角色描述</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.roles}" var="role">
							<tr>
								<td>${role.roleId}</td>
								<td>${role.roleName}</td>
								<td>${role.roleGroupId}</td>
								<td>${role.roleGroupName}</td>
								<td>${role.roleUpdateTime}</td>
								<td>${role.roleMaker}</td>
								<td>${role.roleComment}</td>
								<td><a href="roleUpdate?roleId=${role.roleId}">
										<button class="btn btn-danger"
											onclick="return confirmUpdate()">
											<span class="glyphicon glyphicon-pencil" aria-hidden="true">
											</span> 编辑
										</button>
								</a></td>
								<td><a href="roleDel?roleId=${role.roleId}">
										<button class="btn btn-danger"
											onclick="return confirmDelete()">
											<span class="glyphicon glyphicon-trash" aria-hidden="true">
											</span> 删除
										</button>
								</a></td>
							</tr>
					</c:forEach>
					</tbody>

				</table>
				<div class="panel-footer">
					<c:if test="${pagingVO != null}">
						<nav style="text-align: center">
							<ul class="pagination">
								<li><a
									href="<%=basePath%>/sm/roleList?page=${pagingVO.upPageNo}">&laquo;上一页</a></li>
								<li class="active"><a href="">${pagingVO.curentPageNo}</a></li>
								<c:if test="${pagingVO.curentPageNo+1 <= pagingVO.totalCount}">
									<li><a
										href="<%=basePath%>/sm/roleList?page=${pagingVO.curentPageNo+1}">${pagingVO.curentPageNo+1}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+2 <= pagingVO.totalCount}">
									<li><a
										href="<%=basePath%>/sm/roleList?page=${pagingVO.curentPageNo+2}">${pagingVO.curentPageNo+2}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+3 <= pagingVO.totalCount}">
									<li><a
										href="<%=basePath%>/sm/roleList?page=${pagingVO.curentPageNo+3}">${pagingVO.curentPageNo+3}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+4 <= pagingVO.totalCount}">
									<li><a
										href="<%=basePath%>/sm/roleList?page=${pagingVO.curentPageNo+4}">${pagingVO.curentPageNo+4}</a></li>
								</c:if>
								<li><a
									href="<%=basePath%>/sm/roleList?page=${pagingVO.totalCount}">最后一页&raquo;</a></li>
							</ul>
						</nav>
					</c:if>
				</div>
			</div>
		</div>
	</div>

</body>
<script type="text/javascript">
		$("#nav li:nth-child(2)").addClass("active");



        $("#sub").click(function () {
            $("#form1").submit();
        });
        
	</script>
</html>