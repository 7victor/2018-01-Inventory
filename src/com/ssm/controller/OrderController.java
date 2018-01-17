package com.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.ssm.po.Good;
import com.ssm.po.OrderGoods;
import com.ssm.service.GoodService;
import com.ssm.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private GoodService goodService;
	/**
	 * 销售管理
	 * @param session
	 * @param orderGoods
	 * @param page
	 * @return
	 */
	@RequestMapping("addOrder")
	public ModelAndView addOrder(HttpSession session,OrderGoods orderGoods,String page){
		if(page==null||"".equals(page)){
			page="1";
		}
		ModelAndView mv = new ModelAndView();
		if(orderGoods.getGoodId()!=null &&!"".equals(orderGoods.getGoodId())){
			Good good = goodService.getGoodById(orderGoods.getGoodId());
			if(good==null){
				mv.addObject("mess", "商品不存在");
			}else{
				orderGoods.setGoodName(good.getGoodName());
				try {
					String orderId = orderService.saveOrderGoods(orderGoods);
					orderGoods.setOrderId(orderId);
					mv.addObject("mess", "保存成功！");
				} catch (Exception e) {
					mv.addObject("mess", "保存失败，出现未知错误 ，请重试！");
				}
			}
		}
		if(orderGoods.getOrderId()!=null && !"".equals(orderGoods.getOrderId())){
			PageInfo<OrderGoods> pageInfo = orderService.getOrderGoodPageInfo(Integer.parseInt(page), 10, orderGoods.getOrderId());
			mv.addObject("pageInfo", pageInfo);
		}
		mv.setViewName("add_order");
		mv.addObject("orderGoodsVo", orderGoods);
		return mv;
	}
	/**
	 * 订单提交
	 * @param page
	 * @return
	 */
	@RequestMapping("saveOrderAjax")
	public  @ResponseBody Map<String, String> saveOrderAjax(String orderId){
		Map<String, String> map = new HashMap<>();
		try {
			orderService.saveOrder(orderId);
			map.put("mess", "保存成功！");
		} catch (Exception e) {
			map.put("mess", "保存失败，出现未知错误 ，请重试！");
		}
		return map;
	}
}
