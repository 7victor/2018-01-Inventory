package com.ssm.service;

import java.util.List;

import com.ssm.po.Menu;

public interface MenuService {
	public List<Menu> queryMenuByFlag(String flag);
}
