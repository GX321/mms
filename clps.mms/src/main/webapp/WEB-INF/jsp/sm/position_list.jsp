<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath", basePath); 
%>
<!DOCTYPE html>
<html>
<head>
	<title>职位信息显示</title>

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
					    	<h1 class="col-md-5">职位信息显示</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="positionSelect" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入职位名称" name="positionName">
									<span class="input-group-addon btn" id="sub">查询</span>
								</div>
							</form>
							
                            <button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='<%=basePath%>/util/positionVo_list'">
								职位Excel导入
								<span class="glyphicon glyphicon-plus"></span>
							</button>
						</div>
				    </div>
				    <table class="table table-bordered">
					        <thead>
					            <tr>
					               	<th nowrap="nowrap">职位序号</th>
									<th nowrap="nowrap">职位名称</th>
									<th nowrap="nowrap">创建人</th>
									<th nowrap="nowrap">创建时间</th>
									<th nowrap="nowrap">修改人</th>
									<th nowrap="nowrap">修改时间</th>
									<th nowrap="nowrap">职位描述</th>
					            </tr>
					        </thead>
					        <tbody>
							<c:forEach items="${positions}" var="position" varStatus="stauts">
						
		<tr>
			<td>${5*pagingVO.pageNum-5+stauts.count}</td>
			<td>${position.positionName}</td>
			<td>${position.positionCreatedName}</td>
			<td><fmt:formatDate value="${position.positionCreatedDatetime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
			<td>${position.positionUpdatedName}</td>
			<td><fmt:formatDate value="${position.positionUpdatedDatetime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
			<td>${position.positionComment}</td>
			<td><a href="positionUpdate?positionid=${position.positionId}&page=${pagingVO.pageNum}">
						<button class="btn btn-info" onclick="return confirmUpdate()">
							<span class="glyphicon glyphicon-pencil" aria-hidden="true">
							</span> 
							编辑
						</button></a></td>
						<td><a href="positionDelete?positionid=${position.positionId}&page=${pagingVO.pageNum}">
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
									<li><a href="positionList?page=${pagingVO.prePage}">&laquo;上一页</a></li>
									<li class="active"><a href="">${pagingVO.pageNum}</a></li>
									<c:if test="${pagingVO.pageNum+1 <= pagingVO.pages}">
										<li><a href="positionList?page=${pagingVO.pageNum+1}">${pagingVO.pageNum+1}</a></li>
									</c:if>
									<c:if test="${pagingVO.pageNum+2 <= pagingVO.pages}">
										<li><a href="positionList?page=${pagingVO.pageNum+2}">${pagingVO.pageNum+2}</a></li>
									</c:if>
									<c:if test="${pagingVO.pageNum+3 <= pagingVO.pages}">
										<li><a href="positionList?page=${pagingVO.pageNum+3}">${pagingVO.pageNum+3}</a></li>
									</c:if>
									<c:if test="${pagingVO.pageNum+4 <= pagingVO.pages}">
										<li><a href="positionList?page=${pagingVO.pageNum+4}">${pagingVO.pageNum+4}</a></li>
									</c:if>
									<li><a href="positionList?page=${pagingVO.lastPage}">最后一页&raquo;</a></li>
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
			if (${pagingVO.pageNum} == ${pagingVO.lastPage}) {
				$(".pagination li:last-child").addClass("disabled")
			};

			if (${pagingVO.pageNum} == 1) {
				$(".pagination li:nth-child(1)").addClass("disabled")
			};
        </c:if>
	</script>
</html>