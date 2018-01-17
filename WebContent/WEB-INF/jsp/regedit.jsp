<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>注册</title>
<meta name="description" content="这是一个 注册 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/resources/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/amazeui.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/amazeui.datatables.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/app.css">
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
</head>

<body data-type="login">
    <script src="${pageContext.request.contextPath}/resources/js/theme.js"></script>
    <div class="am-g tpl-g">
        <!-- 风格切换 -->
        <div class="tpl-skiner">
            <div class="tpl-skiner-toggle am-icon-cog">
            </div>
            <div class="tpl-skiner-content">
                <div class="tpl-skiner-content-title">
                    选择主题
                </div>
                <div class="tpl-skiner-content-bar">
                    <span class="skiner-color skiner-white" data-color="theme-white"></span>
                    <span class="skiner-color skiner-black" data-color="theme-black"></span>
                </div>
            </div>
        </div>
        <div class="tpl-login">
            <div class="tpl-login-content">
                <div class="tpl-login-title">注册用户</div>
                <span class="tpl-login-content-info">
                  创建一个新的用户
              </span>
				<form class="am-form tpl-form-line-form" id="submitForm">
				<div class="am-form-group">
					<div class="am-u-sm-9">
						<select data-am-selected="{searchBox: 1}" id="userType"  style="display: none;">
							<option value="1">销售员</option>
							<option value="2">进货员</option>
							<option value="3">仓库管理员</option>
						</select>
					</div>
				</div>
                	<div class="am-form-group">
                        <input type="text" class="tpl-form-input" id="userId" placeholder="账号">
                    </div>
                    <div class="am-form-group">
                        <input type="text" class="tpl-form-input" id="userName" placeholder="用户名">
                    </div>
                    <div class="am-form-group">
                        <input type="password" class="tpl-form-input" id="userPwd" placeholder="请输入密码">
                    </div>
					<div class="am-form-group">
						<input type="password" class="tpl-form-input" id="user-pwd"
							placeholder="再次输入密码">
					</div>
					<div class="am-form-group">
                        <input type="text" class="tpl-form-input" id="userEmail" placeholder="邮箱">
                    </div>
					<div class="am-form-group tpl-login-remember-me">
                        <input id="agreeCheckBox" type="checkbox">
                        <label for="remember-me">
                      	  我已阅读并同意 <a href="javascript:;">《用户注册协议》</a> 
                         </label>
                    </div>
                    <div class="am-form-group">
                        <button type="button" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">提交</button>

                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/resources/js/amazeui.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
<script type="text/javascript">
	$(".tpl-login-btn").click(function(){
		if(!$("#agreeCheckBox").is(":checked")){
			return;
		}
		var userId = $("#userId").val();
		if(userId==""){
			alert("账号不能为空");
			return;
		}
		var userName = $("#userName").val();
		if(userName==""){
			alert("用户名不能为空");
			return;
		}
		var user_pwd = $("#user-pwd").val();
		var userPwd = $("#userPwd").val();
		if(userPwd==""){
			alert("密码不能为空");
			return;
		}
		var userEmail = $("#userEmail").val();
		if(userEmail==""){
			alert("邮箱不能为空");
			return;
		}
		if(user_pwd!=userPwd ){
			alert("两次密码不一致！");
			return;
		}
		var userType = $("#userType").val();
		var data = "userId="+userId+"&userName="+userName+"&userPwd="+userPwd
				+"&userType="+userType+"&userEmail="+userEmail;
		$.ajax({
		    type: 'post',
		    url: 'doRegeditAjax.action',
		    data: data,
		    success: function(data) {
		        alert(data.mess);
		        if(data.mess=="注册成功！"){
		        	location.href="login.action";
		        }
		    }
		});
	})
</script>
</body>

</html>