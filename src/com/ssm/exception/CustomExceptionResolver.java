package com.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理器
 *
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, 
			HttpServletResponse response, Object handler,Exception ex) {
		// TODO Auto-generated method stub
		//handler就是处理器适配器要执行的handle对象（只有Method）
		//解析异常类型，系统自定义异常->
		CustomException customException=null;
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else {
			customException = new CustomException("未知错误，请与管理员联系");
		}
		String message = customException.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", message);
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
