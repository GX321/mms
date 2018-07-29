<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/zTreeStyle/zTreeStyle.css">
	
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=basePath%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=basePath%>/js/jquery.ztree.all.min.js"></script>
	<script src="<%=basePath%>/js/bootstrap.min.js"></script>

<script type="text/javascript">
	/* $(function(){
	
		$("#navmenu").mouseover(function(){
		$(this).children("ul").show();
		});
		$("#navmenu").mouseout(function(){
		$(this).children("ul").hide();
		});	 

	}); */
	
	
    
    

    $(document).ready(function(){
    	
    	$.ajax(
				{
					type: "get",
					url: "<%=basePath%>/sm/Json",
					async: true ,//异步
					cache: false, //清除缓存
					datatype: "json",
					success: function(data){
						 console.log( data);
				    	var setting = {
				                data: {  
				                    simpleData: {  
				                        enable: true
				                    }  
				                }
				            };
				            $.fn.zTree.init($("#treeDemo"), setting,data);   
					}	
		});

    });

	
</script> 
</head>
<div class="col-md-2">

<h3>
<ul class="ztree" id="treeDemo">  </ul>
</h3>
    

  
</div>

</html>
