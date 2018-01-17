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
				<c:forEach items="${menuList }" var="menu">
					<li class="sidebar-nav-link"><a href="${menu.menuAddress }">
							<i class="am-icon-home sidebar-nav-link-logo"></i>${menu.menuName }
					</a></li>
				</c:forEach>
			</ul>
		</div>
		<!-- 内容区域 -->
		<div class="tpl-content-wrapper">
			<div class="row-content am-cf">
				<div class="row">
					<div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
						<div class="widget am-cf">
							<div class="widget-head am-cf">
								<div class="widget-title am-fl">商品信息</div>
								<div class="widget-function am-fr">
									<a href="javascript:;" class="am-icon-cog"></a>
								</div>
							</div>
							<div class="widget-body am-fr">
								<form class="am-form tpl-form-line-form">
									<div class="am-form-group">
										<label for="goodId" class="am-u-sm-3 am-form-label">商品编号
											<span class="tpl-form-line-small-title">goodId</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="goodId" class="tpl-form-input" id="goodId" readonly
												value="${goodVo.goodId}" placeholder="新增无需填写，自动生成"> 
										</div>
									</div>
									<div class="am-form-group">
										<label for="goodName" class="am-u-sm-3 am-form-label">商品名称
											<span class="tpl-form-line-small-title">goodName</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="goodName" class="tpl-form-input" id="userName"  value="${goodVo.goodName}"
												placeholder="商品名称"> 
										</div>
									</div>
									 <div class="am-form-group">
                                        <label for="goodType" class="am-u-sm-3 am-form-label">商品类别 
                                        <span class="tpl-form-line-small-title">goodType</span></label>
                                        <div class="am-u-sm-9">
                                        	<select data-am-selected="{searchBox: 1}" name="goodType" style="display: none;">
												<c:forEach items="${goodTypeList }" var="goodType">
												<c:if test="${goodType.typeId==goodVo.goodType }">
											 		<option value="${goodType.typeId }" selected="selected">${goodType.typeName }</option>
											  	</c:if>
											 	<c:if test="${goodType.typeId!=goodVo.goodType }">
											  		<option value="${goodType.typeId }">${goodType.typeName }</option>
											  	</c:if>
											  </c:forEach>
											</select>
                                        </div>
                                    </div>
									<div class="am-form-group">
										<label for="goodPrice" class="am-u-sm-3 am-form-label">商品价格
											<span class="tpl-form-line-small-title">goodPrice</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="goodPrice" class="tpl-form-input" id="goodPrice" value="${goodVo.goodPrice}"
												placeholder="商品价格"> 
										</div>
									</div>
									<div class="am-form-group">
                                        <label for="goodFlag" class="am-u-sm-3 am-form-label">商品状态 
                                        <span class="tpl-form-line-small-title">goodFlag</span></label>
                                        <div class="am-u-sm-9">
                                        	<select data-am-selected="{searchBox: 1}" name="goodFlag" style="display: none;">
											 	<option value="0">下架</option>
											  	<option value="1" selected="selected">上架</option>
											</select>
                                        </div>
                                    </div>
									<div class="am-form-group">
										<label for="goodNum" class="am-u-sm-3 am-form-label">商品库存
											<span class="tpl-form-line-small-title">goodNum</span>
										</label>
										<div class="am-u-sm-9">
											<input type="text" name="goodNum" class="tpl-form-input" id="goodNum" value="${goodVo.goodNum}"
												placeholder="商品库存"> 
										</div>
									</div>
									<div class="am-form-group" id="changeDiv" >
										<div class="am-u-sm-9 am-u-sm-push-3">
											<button type="button" id="submitButton" 
												class="am-btn am-btn-primary tpl-btn-bg-color-success ">提交</button>
											<button type="button" id="backButton" 
												class="am-btn am-btn-primary tpl-btn-bg-color-success " >返回</button>
										</div>
									</div>
								</form>
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
	$("#backButton").click(function(){
		location.href="good.action";
	})
	$("#submitButton").click(function(){
		var data = $("form").serialize();
		$.ajax({
			type : 'post',
			url : 'saveGoodAjax.action',
			data : data,
			success : function(data) {
				alert(data.mess);
				if (data.mess == "保存成功！") {
					location.href="good.action";
				}
			}
		});
	})
</script>
</body>

</html>