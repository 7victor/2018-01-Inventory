package com.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.ssm.po.Good;
import com.ssm.po.StockGoods;
import com.ssm.service.GoodService;
import com.ssm.service.StockService;
@Controller
public class StockController {
	@Autowired
	private StockService stockService;
	@Autowired
	private GoodService goodService;
	/**
	 * 入库管理页面
	 * @param session
	 * @param stockGoods
	 * @param page
	 * @return
	 */
	@RequestMapping("addStock")
	public ModelAndView addStock(HttpSession session,StockGoods stockGoods,String page){
		if(page==null||"".equals(page)){
			page="1";
		}
		ModelAndView mv = new ModelAndView();
		if(stockGoods.getGoodId()!=null && !"".equals(stockGoods.getGoodId())){
			try {
				Good good = goodService.getGoodById(stockGoods.getGoodId());
				if(good==null){
					mv.addObject("mess", "商品不存在，请重试！");
				}else{
					String stockId = stockService.saveStockGoods(stockGoods);
					stockGoods.setStockId(stockId);
					mv.addObject("mess", "保存成功");
				}
			} catch (Exception e) {
				mv.addObject("mess", "保存失败，出现未知错误 ，请重试！");
			}
		}
		if(stockGoods.getStockId()!=null &&!"".equals(stockGoods.getStockId())){
			PageInfo<StockGoods> pageInfo = stockService.getStockGoodPageInfo(Integer.parseInt(page), 10, stockGoods.getStockId());
			mv.addObject("pageInfo", pageInfo);
		}
		mv.addObject("stockGoodsVo", stockGoods);
		mv.setViewName("add_stock");
		return mv;
	}
}
