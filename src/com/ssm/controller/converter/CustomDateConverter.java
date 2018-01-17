package com.ssm.controller.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * Date数据类型转换器
 *
 */
public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		//将日期改成yyyy-mm-dd HH:MM:SS
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try{
			return sDateFormat.parse(arg0);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
