package com.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.po.Menu;
import com.ssm.po.User;
import com.ssm.service.MenuService;
import com.ssm.service.UserService;



@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private MenuService menuService;
	
	/**
	 * 登录页
	 * @return
	 */
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	/**
	 * 注册页
	 * @return
	 */
	@RequestMapping("regedit")
	public String toregedit() {
		return "regedit";
	}
	/**
	 * 登录ajax
	 * @param userId
	 * @param userPwd
	 * @param session
	 * @return
	 */
	@RequestMapping("doLoginAjax")	
	public @ResponseBody Map<String, String> doLoginAjax(String userId,String userPwd,HttpSession session){
		User queryUser = userService.queryUserInfoById(userId);
		Map<String, String> map = new HashMap<>();
		if(queryUser!=null && queryUser.getUserPwd().equals(userPwd)){
			if("1".equals(queryUser.getUserStatus())){
				map.put("mess", "账号审核中！");
			}else if("2".equals(queryUser.getUserStatus())){
				map.put("mess", "账号已注销！");
			}else{
				map.put("mess", "登录成功！");
				session.setAttribute("user", queryUser);
				List<Menu> menuList = menuService.queryMenuByFlag(queryUser.getUserType());
				session.setAttribute("menuList", menuList);
			}
		}else if(queryUser==null){
			map.put("mess", "账号不存在！");	
		}else{
			map.put("mess", "密码错误！");	
		}
		return map;
	}
	/**
	 * 退出登录
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("loginout")
	public String loginout(HttpSession session) throws Exception {
		System.out.println("用户" + session.getAttribute("userId") + "下线");
		session.removeAttribute("user");
		return "login";
	}
	/**
	 * 注册Ajax
	 * @param user
	 * @param session
	 * @return
	 */
	@RequestMapping("doRegeditAjax")	
	public @ResponseBody Map<String, String> doRegeditAjax(User user,HttpSession session){
		User queryUser = userService.queryUserInfoById(user.getUserId());
		Map<String, String> map = new HashMap<>();
		if(queryUser!=null){
			map.put("mess", "账号已存在！");
		}else{
			try {
				userService.addUser(user);
				map.put("mess", "注册成功！");	
			} catch (Exception e) {
				map.put("mess", "注册失败，出现未知错误 ，请重试！");	
			}
		}
		return map;
	}

	/**
	 * 更新用户Ajax
	 * @param user
	 * @param session
	 * @return
	 */
	@RequestMapping("doUpdateUserAjax")
	public @ResponseBody Map<String, String> doUpdateUserAjax(User user, HttpSession session) {
		Map<String, String> map = new HashMap<>();
		try {
			userService.updateUser(user);
			User queryUser = userService.queryUserInfoById(user.getUserId());
			session.setAttribute("user", queryUser);
			List<Menu> menuList = menuService.queryMenuByFlag(queryUser.getUserType());
			session.setAttribute("menuList", menuList);
			map.put("mess", "更新成功！");
		} catch (Exception e) {
			map.put("mess", "更新失败，出现未知错误 ，请重试！");
		}
		return map;
	}

	/**
	 * 删除用户Ajax
	 * @param userId
	 * @return
	 */
	@RequestMapping("doDelUserAjax")
	public @ResponseBody Map<String, String> doDelUserAjax(String userId) {
		Map<String, String> map = new HashMap<>();
		try {
			userService.delUser(userId);
			map.put("mess", "删除成功！");
		} catch (Exception e) {
			map.put("mess", "删除失败，出现未知错误 ，请重试！");
		}
		return map;
	}

	/**
	 * 同意用户注册Ajax
	 * @param userId
	 * @return
	 */
	@RequestMapping("doAgreeUserAjax")
	public @ResponseBody Map<String, String> doAgreeUserAjax(String userId) {
		Map<String, String> map = new HashMap<>();
		try {
			userService.agreeUser(userId);
			map.put("mess", "审核成功！");
		} catch (Exception e) {
			map.put("mess", "审核失败，出现未知错误 ，请重试！");
		}
		return map;
	}
}
