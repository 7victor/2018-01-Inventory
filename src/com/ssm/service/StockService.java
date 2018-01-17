package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.po.Stock;
import com.ssm.po.StockGoods;

public interface StockService {
	public PageInfo<Stock> getStockPageInfo(int pageNo,int pageSize,String stockId);
	
	public String saveStockGoods(StockGoods stockGoods);
	
	public Stock getStockById(String stockId);
	
	public PageInfo<StockGoods> getStockGoodPageInfo(int pageNo,int pageSize,String stockId);
}
