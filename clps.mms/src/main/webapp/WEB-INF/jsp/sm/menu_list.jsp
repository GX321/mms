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
<title>菜单信息显示</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 引入bootstrap -->
<link rel="stylesheet" type="text/css"
	href="${basePath}/css/bootstrap.min.css">
<!-- 引入JQuery  bootstrap.js-->
<script src="${basePath}/js/jquery-3.2.1.min.js"></script>
<script src="${basePath}/js/bootstrap.min.js"></script>

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
							<h1 class="col-md-5">菜单管理</h1>
							<form class="bs-example bs-example-form col-md-5" role="form"
								style="margin: 20px 0 10px 0;" action="queryMenuByName"
								id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入菜单名"
										name="menuName"> <span class="input-group-addon btn"
										onclick="document.getElementById('form1').submit" id="sub">搜索</span>
								</div>
							</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px"
								onClick="location.href='${basePath}/sm/Addmenu'">
								新增菜单信息
								<sapn class="glyphicon glyphicon-plus" />
							</button>

						</div>
					</div>
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>序号</th>
								<th>名称</th>
								<th>父菜单</th>
								<th>子菜单</th>
								<th>状态</th>
								<th>描述</th>
								<th>创建日期</th>
								<th>创建人名</th>
								<th>修改日期</th>
								<th>修改人名</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${requestScope.menus}" var="menu"
								varStatus="stauts">
								<tr>

									<td>${menu.menuId}</td>
									<td>${menu.menuName}</td>
									<td>${menu.menuParent}</td>
									<td>${menu.menuTarget}</td>
									<td>${menu.isVisable}</td>
									<td>${menu.menuComment}</td>
									<td>${menu.menuCreatedDate}</td>
									<td>${menu.menuCreatedBy}</td>
									<td>${menu.menuUpdatedDate}</td>
									<td>${menu.menuUpdatedBy}</td>
									<td>
										<button class="btn btn-default btn-xs btn-info"
											onClick="location.href='${basePath}/sm/Getmenu?menuId=${menu.menuId}'">编辑</button>
										<button class="btn btn-default btn-xs btn-danger btn-primary"
											onClick="location.href='${basePath}/sm/Delmenu?menuId=${menu.menuId}'">删除</button>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="panel-footer">
						<c:if test="${pagingVO != null}">
							<nav style="text-align: center">
								<ul class="pagination">
									<li><a href="sendmailList?page=${pagingVO.upPageNo}">&laquo;上一页</a></li>
									<li class="active"><a href="">${pagingVO.curentPageNo}</a></li>
									<c:if test="${pagingVO.curentPageNo+1 <= pagingVO.totalCount}">
										<li><a
											href="sendmailList?page=${pagingVO.curentPageNo+1}">${pagingVO.curentPageNo+1}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+2 <= pagingVO.totalCount}">
										<li><a
											href="sendmailList?page=${pagingVO.curentPageNo+2}">${pagingVO.curentPageNo+2}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+3 <= pagingVO.totalCount}">
										<li><a
											href="sendmailList?page=${pagingVO.curentPageNo+3}">${pagingVO.curentPageNo+3}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+4 <= pagingVO.totalCount}">
										<li><a
											href="sendmailList?page=${pagingVO.curentPageNo+4}">${pagingVO.curentPageNo+4}</a></li>
									</c:if>
									<li><a href="sendmailList?page=${pagingVO.totalCount}">最后一页&raquo;</a></li>
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

		function confirmDelete() {
			return confirm("确定删除该职位吗");
		}

		function confirmUpdate() {
			return confirm("确定修改该职位吗");
		}

        $("#sub").click(function () {
            $("#form1").submit();
        });
        <c:if test="${pagingVO != null}">
		if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
			$(".pagination li:last-child").addClass("disabled")
		};

		if (${pagingVO.curentPageNo} == ${1}) {
			$(".pagination li:nth-child(1)").addClass("disabled")
		};
    </c:if>
	</script>
</html>