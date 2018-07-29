<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<title>部门信息显示</title>

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
			<%-- <jsp:include page="menu.jsp"></jsp:include> --%>
			<div class="col-md-10">
				<div class="panel panel-default">
				    <div class="panel-heading">
						<div class="row">
					    	<h1 class="col-md-5">部门信息显示</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="departmentSelect" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入部门名称" name="departmentName">
									<span class="input-group-addon btn" id="sub">查询</span>
								</div>
							</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='addDepartment'">
								添加部门信息
								<sapn class="glyphicon glyphicon-plus"/>
							</button>

						</div>
				    </div>
				    <table class="table table-bordered">
					        <thead>
					            <tr>
					               	<th nowrap="nowrap">编号</th>
									<th nowrap="nowrap">部门名称</th>
									<th nowrap="nowrap">部门地址</th>
									<th nowrap="nowrap">部门电话</th>
									<th nowrap="nowrap">部门介绍</th>
									<th nowrap="nowrap">上级部门</th>
									<th nowrap="nowrap">部门主管</th>
					            </tr>
					        </thead>
					        <tbody>
					        <c:set var="index" value="0" /> 
							<c:forEach items="${requestScope.department}" var="department">
		<tr>
		<c:set var="index" value="${index+1}" /> 
			<td>${index}</td>
			<td>${department.departmentName}</td>
			<td>${department.departmentAddress}</td>
			<td>${department.departmentTelephone}</td>
			<td>${department.departmentIntroduction}</td>
			<td>${department.departmentSuperior}</td>
			<td>${department.departmentRole}</td>
			<td><a href="departmentupdate?id=${department.departmentId}">
						<button class="btn btn-info" onclick="return confirmUpdate()">
							<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span> 
							编辑
						</button></a></td>
						<td><a href="departmentdelete?id=${department.departmentId}">
						<button class="btn btn-danger" onclick="return confirmDelete()" >
							<span class="glyphicon glyphicon-trash" aria-hidden="true">
							</span> 
							删除
						</button></a></td>
		</tr>
					</c:forEach>
					        </tbody>
				    </table>
				    <div class="panel-footer">
						<c:if test="${pagingVO != null}">
							<nav style="text-align: center">
								<ul class="pagination">
									<li><a href="departmentquery?page=${pagingVO.upPageNo}">&laquo;上一页</a></li>
									<li class="active"><a href="">${pagingVO.curentPageNo}</a></li>
									<c:if test="${pagingVO.curentPageNo+1 <= pagingVO.totalCount}">
										<li><a href="departmentquery?page=${pagingVO.curentPageNo+1}">${pagingVO.curentPageNo+1}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+2 <= pagingVO.totalCount}">
										<li><a href="departmentquery?page=${pagingVO.curentPageNo+2}">${pagingVO.curentPageNo+2}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+3 <= pagingVO.totalCount}">
										<li><a href="departmentquery?page=${pagingVO.curentPageNo+3}">${pagingVO.curentPageNo+3}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+4 <= pagingVO.totalCount}">
										<li><a href="departmentquery?page=${pagingVO.curentPageNo+4}">${pagingVO.curentPageNo+4}</a></li>
									</c:if>
									<li><a href="departmentquery?page=${pagingVO.totalCount}">最后一页&raquo;</a></li>
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
			return confirm("确定删除该部门吗");
		}
		function confirmUpdate() {
			return confirm("确定修改该部门吗");
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