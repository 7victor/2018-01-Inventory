package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.MenuMapper;
import com.ssm.po.Menu;
import com.ssm.po.MenuExample;
import com.ssm.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuMapper menuMapper;
	@Override
	public List<Menu> queryMenuByFlag(String flag) {
		MenuExample example = new MenuExample();
		MenuExample.Criteria criteria = example.createCriteria();
		if(!"0".equals(flag)){
			criteria.andMenuFlagEqualTo(flag);
		}
		return menuMapper.selectByExample(example);
	}

}
