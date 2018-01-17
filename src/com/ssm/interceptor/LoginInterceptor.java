package com.ssm.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.po.User;

/**
 * 登陆验证
 * @author Victor
 *
 */
public class LoginInterceptor implements HandlerInterceptor{
	private List<String> uncheckUrls; 
	public List<String> getUncheckUrls() {
		return uncheckUrls;
	}

	public void setUncheckUrls(List<String> uncheckUrls) {
		this.uncheckUrls = uncheckUrls;
	}

	//执行handle完成执行
	//统一的异常处理和日志处理
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handle, Exception exception)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	//进入handle方法之后，返回ModelAndView之前执行
	//应用场景从ModelAndView出发：将公用的模型数据在这里传到视图（如菜单导航）
	//也可以在这里统一指定视图
	@Override
	public void postHandle(HttpServletRequest request, 
		HttpServletResponse response, Object handle, ModelAndView modelAndView)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	//进入handle方法之前,用于身份认证，分身授权：登陆认证，权限校验
	//-》例如身份认证，如果没有登陆，需要此拦截
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) throws Exception {
		// TODO Auto-generated method stub
		//return false表示拦截，不让向下执行
		//true放行
		String url = request.getRequestURI();
		if(url.equals("/Inventory/")){
			return true;
		}
		//判断url是否是公开地址，实际使用时将url配置到配置文件中
		for(String uString:uncheckUrls){
			if(url.indexOf(uString)>=0){
				return true;
			}
		}
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null){
			//身份存在放行
			return true;
		}
		
		//
		request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}

}
