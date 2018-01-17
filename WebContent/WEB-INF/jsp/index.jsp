<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>进销存系统</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/resources/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/resources/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<script
	src="${pageContext.request.contextPath}/resources/js/echarts.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/amazeui.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/amazeui.datatables.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/app.css">
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
</head>
<body data-type="widgets">
	<script src="${pageContext.request.contextPath}/resources/js/theme.js"></script>
	<div class="am-g tpl-g">
		<!-- 头部 -->
		<header> <!-- logo -->
		<div class="am-fl tpl-header-logo">
			<a href="javascript:;"><img
				src="${pageContext.request.contextPath}/resources/img/logo.png"
				alt=""></a>
		</div>
		<!-- 右侧内容 -->
		<div class="tpl-header-fluid">
			<!-- 侧边切换 -->
			<div class="am-fl tpl-header-switch-button am-icon-list">
				<span> </span>
			</div>

			<!-- 其它功能-->
			<div class="am-fr tpl-header-navbar">
				<ul>
					<!-- 欢迎语 -->
					<li class="am-text-sm tpl-header-navbar-welcome"><a
						href="javascript:;">欢迎你, <span>${sessionScope.user.userName}</span>
					</a></li>
					<!-- 退出 -->
					<li class="am-text-sm"><a href="loginout.action"> <span
							class="am-icon-sign-out"></span> 退出
					</a></li>
				</ul>
			</div>
		</div>

		</header>
		<!-- 风格切换 -->
		<div class="tpl-skiner">
			<div class="tpl-skiner-toggle am-icon-cog"></div>
			<div class="tpl-skiner-content">
				<div class="tpl-skiner-content-title">选择主题</div>
				<div class="tpl-skiner-content-bar">
					<span class="skiner-color skiner-white" data-color="theme-white"></span>
					<span class="skiner-color skiner-black" data-color="theme-black"></span>
				</div>
			</div>
		</div>
		<!-- 侧边导航栏 -->
		<div class="left-sidebar">
			<!-- 用户信息 -->
			<div class="tpl-sidebar-user-panel">
				<div class="tpl-user-panel-slide-toggleable">
					<div class="tpl-user-panel-profile-picture">
						<c:if test="${sessionScope.user.userImg!=null}">
							<img
								src="${pageContext.request.contextPath}/resources/img/${sessionScope.user.userImg}"
								alt="">
						</c:if>
						<c:if test="${sessionScope.user.userImg==null}">
							<img
								src="${pageContext.request.contextPath}/resources/img/user01.png"
								alt="">
						</c:if>
					</div>
					<span class="user-panel-logged-in-text"> <i
						class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
						${sessionScope.user.userName}
					</span> <a href="index.action" class="tpl-user-panel-action-link"> <span
						class="am-icon-pencil"></span> 账号设置
					</a>
				</div>
			</div>

			<!-- 菜单 -->
			<ul class="sidebar-nav">
				<li class="sidebar-nav-heading">menu <span
					class="sidebar-nav-heading-info"> 菜单</span></li>
				<c:forEach items="${sessionScope.menuList }" var="menu">
					<li class="sidebar-nav-link"><a href="${menu.menuAddress }">
							<i class="am-icon-home sidebar-nav-link-logo"></i>${menu.menuName }
					</a></li>
				</c:forEach>
			</ul>
		</div>
		<!-- 内容区域 -->
		<div class="tpl-content-wrapper">
			<div class="container-fluid am-cf">
				<div class="row">
					<div class="am-u-sm-12 am-u-md-12 am-u-lg-9">
						<div class="page-header-heading">
							<span class="am-icon-home page-header-heading-icon"></span> 账户设置
							<small>个人中心</small>
						</div>
						<p class="page-header-description">个人信息设置。</p>
					</div>
					<div class="am-u-lg-3 tpl-index-settings-button">
						<button type="button" class="page-header-button">
							<span class="am-icon-paint-brush"></span> 修改
						</button>
					</div>
				</div>
			</div>
			<div class="row-content am-cf">
				<div class="row">
					<div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
						<div class="widget am-cf">
							<div class="widget-head am-cf">
								<div class="widget-title am-fl">个人信息</div>
								<div class="widget-function am-fr">
									<a href="javascript:;" class="am-icon-cog"></a>
								</div>
							</div>
							<div class="widget-body am-fr">
								<form class="am-form tpl-form-line-form">
									<div class="am-form-group">
										<label for="userId" class="am-u-sm-3 am-form-label">账号
											<span class="tpl-form-line-small-title">userId</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="userId" class="tpl-form-input" id="userId" readonly
												value="${sessionScope.user.userId}"> 
										</div>
									</div>
									<div class="am-form-group">
										<label for="userName" class="am-u-sm-3 am-form-label">用户名 
											<span class="tpl-form-line-small-title">userName</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="userName" class="tpl-form-input" id="userName"  value="${sessionScope.user.userName}"
												placeholder="用户名" readonly> 
										</div>
									</div>
									<div class="am-form-group">
										<label for="userEmail" class="am-u-sm-3 am-form-label">邮箱
											<span class="tpl-form-line-small-title">userEmail</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="userEmail" class="tpl-form-input" id="userEmail" value="${sessionScope.user.userEmail}"
												placeholder="个人邮箱" readonly> 
										</div>
									</div>
									<div class="am-form-group">
										<label for="userMess" class="am-u-sm-3 am-form-label">个人说明
											<span class="tpl-form-line-small-title">userMess</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="userMess" class="tpl-form-input" id="userMess" value="${sessionScope.user.userMess}"
												placeholder="个人说明" readonly>
										</div>
									</div>
									<div class="am-form-group">
										<label for="userImg" class="am-u-sm-3 am-form-label">头像
											<span class="tpl-form-line-small-title">userImg</span>
										</label>
										<div class="am-u-sm-9">
											<div class="am-form-group am-form-file">
												<div class="tpl-form-file-img">
													<input type="hidden" name="userImg" id="userImg" value="${sessionScope.user.userImg}">
													<img id="showUserImg" src="${pageContext.request.contextPath}/resources/img/${sessionScope.user.userImg}" alt="">
												</div>
												<button type="button" class="am-btn am-btn-danger am-btn-sm" id="changeImg" style="display: none;">
													<i class="am-icon-cloud-upload"></i> 选择头像
												</button>
											</div>
										</div>
									</div>
									<div class="am-form-group" id="changeDiv" style="display: none;">
										<div class="am-u-sm-9 am-u-sm-push-3">
											<button type="button" id="submitButton" 
												class="am-btn am-btn-primary tpl-btn-bg-color-success ">提交</button>
											<button type="button" id="backButton" 
												class="am-btn am-btn-primary tpl-btn-bg-color-success " >返回</button>
										</div>
									</div>
								</form>
							<div id="allImg" class='tpl-header-fluid' style="display:none;
								position:absolute;top:20px;z-index:999;padding:0 40px 40px 40px;
								width: 580px;height: 350px;">
								<div style="height: 60px"><h6 style="padding-top: 10px;"> 设置头像</h6></div>
								<span style="padding: 10px;height: 100px;"><img onclick="saveImg('user01.png')" src="${pageContext.request.contextPath}/resources/img/user01.png" alt=""></span>
								<span style="padding: 10px;height: 100px;"><img onclick="saveImg('user02.png')" src="${pageContext.request.contextPath}/resources/img/user02.png" alt=""></span>
								<span style="padding: 10px;height: 100px;"><img onclick="saveImg('user03.png')" src="${pageContext.request.contextPath}/resources/img/user03.png" alt=""></span>
								<span style="padding: 10px;height: 100px;"><img onclick="saveImg('user04.png')" src="${pageContext.request.contextPath}/resources/img/user04.png" alt=""></span>
								<br><div style="height: 20px;"></div>
								<span style="padding: 10px;height: 100px;"><img onclick="saveImg('user05.png')" src="${pageContext.request.contextPath}/resources/img/user05.png" alt=""></span>
								<span style="padding: 10px;height: 100px;"><img onclick="saveImg('user06.png')" src="${pageContext.request.contextPath}/resources/img/user06.png" alt=""></span>
								<span style="padding: 10px;height: 100px;"><img onclick="saveImg('user07.png')" src="${pageContext.request.contextPath}/resources/img/user07.png" alt=""></span>
								<br><div style="float:right;padding-right:20px;height: 40px;padding-top: 20px;">
									<button type="button" id="doHideButton"
												class="am-btn am-btn-primary tpl-btn-bg-color-success " >取消</button>
								</div>
							</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/js/amazeui.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/amazeui.datatables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/dataTables.responsive.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
	<script type="text/javascript">
	var oldUserName = $("#userName").val();
	var oldUserEmail = $("#userEmail").val();
	var oldUserMess = $("#userMess").val();
	var oldUserImg = $("#userImg").val();
	$(".page-header-button").click(function(){
		oldUserName = $("#userName").val();
		oldUserEmail = $("#userEmail").val();
		oldUserMess = $("#userMess").val();
		$("#userName").removeAttr("readonly");
		$("#userEmail").removeAttr("readonly");
		$("#userMess").removeAttr("readonly");
		$("#changeImg").show();
		$("#changeDiv").show();
	})
	$("#backButton").click(function(){
		$("#userName").val(oldUserName);
		$("#userEmail").val(oldUserEmail);
		$("#userMess").val(oldUserMess);
		$("#userName").attr("readonly","readonly");
		$("#userEmail").attr("readonly","readonly");
		$("#userMess").attr("readonly","readonly");
		$("#showUserImg").attr("src",'${pageContext.request.contextPath}/resources/img/'+oldUserImg);
		$("#userImg").val(oldUserImg);
		$("#changeImg").hide();
		$("#changeDiv").hide();
	})
	$("#submitButton").click(function(){
		var data = $("form").serialize();
		$.ajax({
			type : 'post',
			url : 'doUpdateUserAjax.action',
			data : data,
			success : function(data) {
				alert(data.mess);
				if (data.mess == "更新成功！") {
					location.href="index.action";
				}
			}
		});
	})
	$("#doHideButton").click(function(){
		$("#allImg").hide();
	})
	$("#changeImg").click(function(){
		$("#allImg").show();
	})
	function saveImg(imgAdd){
		$("#showUserImg").attr("src",'${pageContext.request.contextPath}/resources/img/'+imgAdd);
		$("#userImg").val(imgAdd);
		$("#allImg").hide();
	}
</script>
</body>

</html>