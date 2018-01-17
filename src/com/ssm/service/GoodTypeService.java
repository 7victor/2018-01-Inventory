package com.ssm.service;

import java.util.List;
import com.github.pagehelper.PageInfo;
import com.ssm.po.GoodType;

public interface GoodTypeService {
	public List<GoodType> getAllGoodType();
	
	public PageInfo<GoodType> getGoodType(int pageNo,int pageSize);
	public void delGoodType(String typeId);
	public GoodType getGoodTypeById(String typeId);
	public void saveGoodType(GoodType goodType);
}
