<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setAttribute("basePath", basePath);
%> 
<!DOCTYPE html>
<html>
<head>
	<title></title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="${basePath}/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="${basePath}/js/jquery-3.2.1.min.js"></script>
	<script src="${basePath}/js/bootstrap.min.js"></script>
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
					    	<h1 style="text-align: center;">添加邮件信息</h1>
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="${basePath}/sm/addMail" id="editfrom" method="post">
							  <div class="form-group">
							    <label for="inputEmail3" class="col-sm-2 control-label">邮件主题</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputEmail3" name="emailSubject" placeholder="请输入邮件主题"
								  <c:if test='${sendmail!=null}'>
										 value="${sendmail.emailSubject}"
								  </c:if>/>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">收件人</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="emailRecipient" placeholder="请输入收件人名"
								  <c:if test='${sendmail!=null}'>
										 value="${sendmail.emailRecipient}"
								  </c:if>/>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">发件人</label>
							    <div class="col-sm-10">
								   <input type="text" class="form-control" id="inputPassword3" name="emailAddresser" placeholder="请输入发件人名"
								  <c:if test='${sendmail!=null}'>
										 value="${sendmail.emailAddresser}"
								  </c:if>/>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">邮件内容</label>
							    <div class="col-sm-10">
								   <textarea rows="10" cols="30" name="emailLetter"></textarea>
							    </div>
							  </div>
							  <div class="form-group" style="text-align: center">
								<button class="btn btn-default" type="submit"  onclick="confirmd()">提交</button>
								<button class="btn btn-default" type="reset">重置</button>
							  </div>
						</form>
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
		$("#nav li:nth-child(2)").addClass("active")
		
		function confirmd() {
            var msg = confirm("您真的确定要提交吗？！");
            if (msg==true){
            	alert("添加成功！");;
            }else{
                return false;
            }
        };
	</script>
</html>