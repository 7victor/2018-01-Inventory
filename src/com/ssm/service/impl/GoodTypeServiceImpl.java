package com.ssm.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.GoodTypeMapper;
import com.ssm.po.GoodType;
import com.ssm.po.GoodTypeExample;
import com.ssm.service.GoodTypeService;
import com.ssm.util.Common;
@Service
public class GoodTypeServiceImpl implements GoodTypeService {
	@Autowired
	private GoodTypeMapper goodTypeMapper;
	@Override
	public List<GoodType> getAllGoodType() {
		// TODO Auto-generated method stub
		return goodTypeMapper.selectByExample(new GoodTypeExample());
	}
	@Override
	public PageInfo<GoodType> getGoodType(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo,pageSize);
		GoodTypeExample example = new GoodTypeExample();
		example.setOrderByClause("type_time desc");
		List<GoodType> list = goodTypeMapper.selectByExample(example);
		PageInfo<GoodType> pageInfo = new PageInfo<GoodType>(list);
		return pageInfo;
	}
	public void delGoodType(String typeId){
		goodTypeMapper.deleteByPrimaryKey(typeId);
	}
	@Override
	public GoodType getGoodTypeById(String typeId) {
		// TODO Auto-generated method stub
		return goodTypeMapper.selectByPrimaryKey(typeId);
	}
	@Override
	public void saveGoodType(GoodType goodType) {
		if(goodType.getTypeId()==null|| "".equals(goodType.getTypeId())){
			goodType.setTypeId(new Common().getId());
			goodType.setTypeTime(new Date());
			goodTypeMapper.insert(goodType);
		}else{
			goodTypeMapper.updateByPrimaryKey(goodType);
		}
	}
}
