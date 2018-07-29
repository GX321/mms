<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<html>
<head>
	<title>学生信息显示</title>


	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=basePath%>/js/bootstrap.min.js"></script>

	<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

</head>
<body>
	<!-- 顶栏 -->
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 中间主体 -->
	<div class="container" id="content">
		<div class="row">
			<div class="col-md-10">
				<div class="panel panel-default">
				    <div class="panel-heading">
						<div class="row">
					    	<h1 class="col-md-5">账户信息列表</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="accountQuery" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control"  name="account" placeholder="请输入账户名称" name="findByName">
									<span class="input-group-addon btn" id="sub">搜索</span>
								</div>
							</form>     
							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='<%=basePath%>/sm/addview'">
								新增账户信息
								<span class="glyphicon glyphicon-plus"></span>
							</button>

						</div>
				    </div>
				    <table class="table table-bordered">
					        <thead>
					            <tr>
					               <th>序号</th>
			                       <th>账户姓名</th>
			                       <th>账户</th>
			                       <th>用户职位</th>
			                       <th>用户部门</th>
			                       <th>用户角色</th>
			                       <th>用户手机</th>
			                       <th>用户电话</th>
			                       <th>创建时间</th>
			                       <th>修改时间</th>
			                       <th>操作</th>
					            </tr>
					        </thead>
					        <tbody>
							<c:forEach  items="${requestScope.account}" var="acc" varStatus="stauts">
								<tr>
			                      <td>${5*pagingVO.curentPageNo-5+stauts.count}</td>
			                      <td>${acc.accountName}</td>
			                      <td>${acc.account}</td>
			                      <td>${acc.accountPosition}</td>
			                      <td>${acc.accountDepartment}</td>
			                      <td>${acc.accountRole}</td>
			                      <td>${acc.accountPhone}</td>
			                      <td>${acc.accountTelephone}</td>
			                      <td>${acc.accountCreatedDatetime}</td>
			                      <td>${acc.accountUpdatedDatetime}</td>
			                      <td><a href="editview?account=${acc.account}">编辑</a>|<a href="accountDelete?account=${acc.account}">删除</a></td>
		</tr>
							</c:forEach>
					        </tbody>
				    </table>
				    <div class="panel-footer">
						<c:if test="${pagingVO != null}">
							<nav style="text-align: center">
								<ul class="pagination">
									<li><a href="/admin/showStudent?page=${pagingVO.upPageNo}">&laquo;上一页</a></li>
									<li class="active"><a href="">${pagingVO.curentPageNo}</a></li>
									<c:if test="${pagingVO.curentPageNo+1 <= pagingVO.totalCount}">
										<li><a href="<%=basePath%>/sm/accountQuery?page=${pagingVO.curentPageNo+1}">${pagingVO.curentPageNo+1}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+2 <= pagingVO.totalCount}">
										<li><a href="<%=basePath%>/sm/accountQuery?page=${pagingVO.curentPageNo+2}">${pagingVO.curentPageNo+2}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+3 <= pagingVO.totalCount}">
										<li><a href="<%=basePath%>/sm/accountQuery?page=${pagingVO.curentPageNo+3}">${pagingVO.curentPageNo+3}</a></li>
									</c:if>
									<c:if test="${pagingVO.curentPageNo+4 <= pagingVO.totalCount}">
										<li><a href="<%=basePath%>/sm/accountQuery?page=${pagingVO.curentPageNo+4}">${pagingVO.curentPageNo+4}</a></li>
									</c:if>
									<li><a href="<%=basePath%>/sm/accountQuery?page=${pagingVO.totalCount}">最后一页&raquo;</a></li>
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

        function confirmd() {
            var msg = "您真的确定要删除吗？！";
            if (confirm(msg)==true){
                return true;
            }else{
                return false;
            }
        };

        $("#sub").click(function () {
            $("#form1").submit();
        });
       
	</script>
</html>