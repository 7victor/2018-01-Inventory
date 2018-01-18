package com.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.ssm.po.Good;
import com.ssm.po.GoodType;
import com.ssm.service.GoodService;
import com.ssm.service.GoodTypeService;
/**
 * 商品控制器
 * @author Administrator
 *
 */
@Controller
public class GoodContorller {
	@Autowired
	private GoodTypeService goodTypeService;
	@Autowired
	private GoodService goodService;
	/**
	 * 删除商品
	 * @param goodId
	 * @return
	 */
	@RequestMapping("doDelGoodAjax")
	public @ResponseBody Map<String, String> doDelGoodAjax(String goodId) {
		Map<String, String> map = new HashMap<>();
		try {
			goodService.delGood(goodId);
			map.put("mess", "删除成功！");
		} catch (Exception e) {
			map.put("mess", "删除失败，出现未知错误 ，请重试！");
		}
		return map;
	}

	/**
	 * 删除商品类别
	 * @param typeId
	 * @return
	 */
	@RequestMapping("doDelGoodTypeAjax")
	public @ResponseBody Map<String, String> doDelGoodTypeAjax(String typeId) {
		Map<String, String> map = new HashMap<>();
		try {
			goodTypeService.delGoodType(typeId);
			map.put("mess", "删除成功！");
		} catch (Exception e) {
			map.put("mess", "删除失败，出现未知错误 ，请重试！");
		}
		return map;
	}
	/**
	 * 商品信息管理页面
	 * @param session
	 * @param goodId
	 * @return
	 */
	@RequestMapping("addGood")
	public ModelAndView addGood(HttpSession session,String goodId){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add_good");
		List<GoodType> goodType = goodTypeService.getAllGoodType();
		mv.addObject("goodTypeList", goodType);
		if(goodId!=null && !"".equals(goodId)){
			Good good = goodService.getGoodById(goodId);
			mv.addObject("goodVo", good);
		}
		return mv;
	}
	/**
	 * 商品类别信息管理页面
	 * @param session
	 * @param typeId
	 * @return
	 */
	@RequestMapping("addGoodType")
	public ModelAndView addGoodType(HttpSession session,String typeId){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add_good_type");
		List<GoodType> goodTypeList = goodTypeService.getAllGoodType();
		mv.addObject("goodTypeList", goodTypeList);
		if(typeId!=null && !"".equals(typeId)){
			GoodType goodType = goodTypeService.getGoodTypeById(typeId);
			mv.addObject("goodTypeVo", goodType);
		}
		return mv;
	}
	/**
	 * 商品信息保存Ajax
	 * @param page
	 * @return
	 */
	@RequestMapping("saveGoodAjax")
	public  @ResponseBody Map<String, String> saveGoodAjax(Good good){
		Map<String, String> map = new HashMap<>();
		try {
			goodService.saveGood(good);
			map.put("mess", "保存成功！");
		} catch (Exception e) {
			map.put("mess", "保存失败，出现未知错误 ，请重试！");
		}
		return map;
	}
	/**
	 * 商品类别信息保存Ajax
	 * @param page
	 * @return
	 */
	@RequestMapping("saveGoodTypeAjax")
	public  @ResponseBody Map<String, String> saveGoodTypeAjax(GoodType goodType){
		Map<String, String> map = new HashMap<>();
		try {
			goodTypeService.saveGoodType(goodType);
			map.put("mess", "保存成功！");
		} catch (Exception e) {
			map.put("mess", "保存失败，出现未知错误 ，请重试！");
		}
		return map;
	}
}
