package com.ssm.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.GoodMapper;
import com.ssm.mapper.OrderGoodsMapper;
import com.ssm.mapper.OrdersMapper;
import com.ssm.po.Good;
import com.ssm.po.OrderGoods;
import com.ssm.po.OrderGoodsExample;
import com.ssm.po.OrderGoodsKey;
import com.ssm.po.Orders;
import com.ssm.po.OrdersExample;
import com.ssm.service.OrderService;
import com.ssm.util.Common;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private OrderGoodsMapper orderGoodsMapper;
	@Autowired
	private GoodMapper goodMapper;
	@Override
	public PageInfo<Orders> getOrderPageInfo(int pageNo, int pageSize, String orderId) {
		PageHelper.startPage(pageNo, pageSize);
		OrdersExample example = new OrdersExample();
		if(orderId!=null && !"".equals(orderId)){
			OrdersExample.Criteria criteria = example.createCriteria();
			criteria.andOrderIdEqualTo(orderId);
		}
		List<Orders> list = ordersMapper.selectByExample(example);
		PageInfo<Orders> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public String saveOrderGoods(OrderGoods orderGoods) {
		if(orderGoods.getOrderId()==null || "".equals(orderGoods.getOrderId())){
			orderGoods.setOrderId(new Common().getId());
		}
		OrderGoodsKey key = new OrderGoodsKey();
		key.setGoodId(orderGoods.getGoodId());
		key.setOrderId(orderGoods.getOrderId());
		OrderGoods goods = orderGoodsMapper.selectByPrimaryKey(key);
		if(goods==null){
			orderGoodsMapper.insert(orderGoods);
		}else{
			orderGoods.setGoodNum(orderGoods.getGoodNum()+goods.getGoodNum());
			orderGoodsMapper.updateByPrimaryKey(orderGoods);
		}
		return orderGoods.getOrderId();
	}

	@Override
	public void saveOrder(String orderId) {
		Orders order = new Orders();
		order.setOrderId(orderId);
		order.setOrderFlag("1");
		order.setOrderTime(new Date());
		OrderGoodsExample example = new OrderGoodsExample();
		OrderGoodsExample.Criteria criteria = example.createCriteria();
		criteria.andOrderIdEqualTo(orderId);
		List<OrderGoods> list = orderGoodsMapper.selectByExample(example);
		int num = 0;
		float price = 0;
		for(OrderGoods goods:list){
			num+=goods.getGoodNum();
			Good g = goodMapper.selectByPrimaryKey(goods.getGoodId());
			g.setGoodNum(g.getGoodNum()-goods.getGoodNum());
			price+=g.getGoodPrice();
			goodMapper.updateByPrimaryKey(g);
		}
		order.setOrderNum(num);
		order.setOrderPrice(price);
		ordersMapper.insert(order);
	}

	@Override
	public Orders getOrderById(String orderId) {
		// TODO Auto-generated method stub
		return ordersMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public PageInfo<OrderGoods> getOrderGoodPageInfo(int pageNo, int pageSize, String orderId) {
		PageHelper.startPage(pageNo, pageSize);
		OrderGoodsExample example = new OrderGoodsExample();
		OrderGoodsExample.Criteria criteria = example.createCriteria();
		criteria.andOrderIdEqualTo(orderId);
		List<OrderGoods> list = orderGoodsMapper.selectByExample(example);
		PageInfo<OrderGoods> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

}
