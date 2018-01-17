package com.ssm.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.GoodMapper;
import com.ssm.po.Good;
import com.ssm.po.GoodExample;
import com.ssm.service.GoodService;
import com.ssm.util.Common;
@Service
public class GoodServiceImpl implements GoodService {
	@Autowired
	private GoodMapper goodMapper;
	@Override
	public PageInfo<Good> getGoodPageInfo(int pageNo, int pageSize, Good good) {
		PageHelper.startPage(pageNo,pageSize);
		GoodExample example = new GoodExample();
		GoodExample.Criteria criteria = example.createCriteria();
		if(good.getGoodType()!=null&&!"".equals(good.getGoodType()) &&!"0".equals(good.getGoodType())){
			criteria.andGoodTypeEqualTo(good.getGoodType());
		}
		if(good.getGoodFlag()!=null&&!"".equals(good.getGoodFlag())){
			criteria.andGoodFlagEqualTo(good.getGoodFlag());
		}
		if(good.getGoodId()!=null&&!"".equals(good.getGoodId())){
			criteria.andGoodIdEqualTo(good.getGoodId());
		}
		if(good.getGoodName()!=null&&!"".equals(good.getGoodName())){
			criteria.andGoodNameEqualTo(good.getGoodName());
		}
		example.setOrderByClause("good_last_time desc");
		List<Good> list = goodMapper.selectByExample(example);
		PageInfo<Good> pageInfo = new PageInfo<Good>(list);
		return pageInfo;
	}
	public void delGood(String goodId){
		goodMapper.deleteByPrimaryKey(goodId);
	}
	@Override
	public Good getGoodById(String goodId) {
		return goodMapper.selectByPrimaryKey(goodId);
	}
	@Override
	public void saveGood(Good good) {
		good.setGoodLastTime(new Date());
		if(good.getGoodId()==null||"".equals(good.getGoodId())){
			good.setGoodId(new Common().getId());
			goodMapper.insert(good);
		}else{
			goodMapper.updateByPrimaryKey(good);
		}
	}
}
