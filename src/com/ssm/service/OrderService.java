package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.po.Orders;
import com.ssm.po.OrderGoods;

public interface OrderService {
	public PageInfo<Orders> getOrderPageInfo(int pageNo,int pageSize,String orderId);
	
	public String saveOrderGoods(OrderGoods orderGoods);
	
	public void saveOrder(String orderId);
	
	public Orders getOrderById(String orderId);
	
	public PageInfo<OrderGoods> getOrderGoodPageInfo(int pageNo,int pageSize,String orderId);
}
