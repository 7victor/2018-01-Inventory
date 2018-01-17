package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.po.User;

public interface UserService {
	/**
	 * 获取用户信息方法
	 * @return
	 */
	public User queryUserInfoById(String userId);
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(User user);
	
	public PageInfo<User> querUserPage(int pageNo,int pageSize,User user);
	public void delUser(String userId);
	public void agreeUser(String userId);
}
