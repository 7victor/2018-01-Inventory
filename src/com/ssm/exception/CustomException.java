package com.ssm.exception;
/**
 * 自定义异常类
 * @author Victor
 *
 */
@SuppressWarnings("serial")
public class CustomException extends Exception{
	
	private String message;
	
	public CustomException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
