package com.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 生成编号，格式化时间
 * @author Administrator
 *
 */
public class Common {
	private String id;
	private String date;
	/**
	 * 生成id
	 * @return
	 */
	public String getId(){
		String newfilename = UUID.randomUUID().toString().replace("-", "").substring(0,6);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
		Date date = new Date();
		id = simpleDateFormat.format(date);
		id+=newfilename;
		return id;
	}
	public String getdatehhmmss(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.date = simpleDateFormat.format(date);
		return this.date;
	}
	public String getdatemmdd(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		this.date = simpleDateFormat.format(date);
		return this.date;
	}
	public Date getDate(String sdate) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = simpleDateFormat.parse(sdate);
		return date;
	}
}
