package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.po.Good;

public interface GoodService {
	public PageInfo<Good> getGoodPageInfo(int pageNo,int pageSize,Good good);
	
	public void delGood(String goodId);
	
	public Good getGoodById(String goodId);
	
	public void saveGood(Good good);
}
