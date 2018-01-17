package com.ssm.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageInfo;
import com.ssm.po.Good;
import com.ssm.po.GoodType;
import com.ssm.po.User;
import com.ssm.service.GoodService;
import com.ssm.service.GoodTypeService;
import com.ssm.service.UserService;

@Controller
public class MenuController {
	@Autowired
	private GoodTypeService goodTypeService;
	@Autowired
	private GoodService goodService;
	@Autowired
	private UserService userService;
	/**
	 * 初始化页面 个人信息
	 * @param session
	 * @return
	 */
	@RequestMapping("index")
	public ModelAndView index(HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	/**
	 * 商品管理页面
	 * @param session
	 * @param page
	 * @param good
	 * @return
	 */
	@RequestMapping("good")
	public ModelAndView good(HttpSession session,String page,Good good){
		if(page==null||"".equals(page)){
			page="1";
		}
		good.setGoodFlag("1");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("good");
		List<GoodType> goodType = goodTypeService.getAllGoodType();
		mv.addObject("goodTypeList", goodType);
		mv.addObject("goodVo",good);
		PageInfo<Good> goodList = goodService.getGoodPageInfo(Integer.parseInt(page), 10, good);
		mv.addObject("goodList",goodList);
		return mv;
	}
	/**
	 * 商品类别管理页面
	 * @param session
	 * @param page
	 * @return
	 */
	@RequestMapping("goodType")
	public ModelAndView goodType(HttpSession session,String page){
		if(page==null||"".equals(page)){
			page="1";
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("good_type");
		PageInfo<GoodType> info = goodTypeService.getGoodType(Integer.parseInt(page), 10);
		mv.addObject("goodTypeList", info);
		return mv;
	}
	/**
	 * 用户管理页面
	 * @param session
	 * @param page
	 * @param user
	 * @return
	 */
	@RequestMapping("user")
	public ModelAndView user(HttpSession session,String page,User user){
		if(page==null||"".equals(page)){
			page="1";
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user");
		mv.addObject("userVo", user);
		PageInfo<User> info = userService.querUserPage(Integer.parseInt(page), 10, user);
		mv.addObject("userList", info);
		return mv;
	}
}
