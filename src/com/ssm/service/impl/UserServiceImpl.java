package com.ssm.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.UserMapper;
import com.ssm.po.User;
import com.ssm.po.UserExample;
import com.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public User queryUserInfoById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	@Override
	public void addUser(User user) {
		user.setUserImg("user01.png");
		user.setUserStatus("1");
		user.setUserCreatTime(new Date());
		userMapper.insert(user);
	}
	@Override
	public void updateUser(User user) {
		User queryUser = this.queryUserInfoById(user.getUserId());
		user.setUserPwd(queryUser.getUserPwd());
		user.setUserType(queryUser.getUserType());
		user.setUserStatus(queryUser.getUserStatus());
		userMapper.updateByPrimaryKey(user);
	}
	@Override
	public PageInfo<User> querUserPage(int pageNo, int pageSize, User user) {
		PageHelper.startPage(pageNo,pageSize);
		UserExample example = new UserExample();
		example.setOrderByClause("user_creat_time desc");
		UserExample.Criteria criteria = example.createCriteria();
		if(user.getUserId()!=null && !"".equals(user.getUserId())){
			criteria.andUserIdEqualTo(user.getUserId());
		}
		List<User> list = userMapper.selectByExample(example);
		PageInfo<User> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	@Override
	public void delUser(String userId) {
		userMapper.deleteByPrimaryKey(userId);
	}
	@Override
	public void agreeUser(String userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		user.setUserStatus("0");
		userMapper.updateByPrimaryKey(user);
	}

}
