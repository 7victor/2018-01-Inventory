package com.ssm.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mapper.GoodMapper;
import com.ssm.mapper.StockGoodsMapper;
import com.ssm.mapper.StockMapper;
import com.ssm.po.Good;
import com.ssm.po.Stock;
import com.ssm.po.StockGoods;
import com.ssm.po.StockGoodsExample;
import com.ssm.po.StockGoodsKey;
import com.ssm.service.StockService;
import com.ssm.util.Common;
@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockMapper stockMapper;
	@Autowired
	private StockGoodsMapper stockGoodsMapper;
	@Autowired
	private GoodMapper goodMapper;
	@Override
	public PageInfo<Stock> getStockPageInfo(int pageNo, int pageSize, String stockId) {
		return null;
	}
	@Override
	public String saveStockGoods(StockGoods stockGoods) {
		Stock stock = new Stock();
		if(stockGoods.getStockId()==null || "".equals(stockGoods.getStockId())){
			stockGoods.setStockId(new Common().getId());
			stock.setStockId(stockGoods.getStockId());
			stock.setStockPrice(stockGoods.getGoodPrice());
			stock.setStockTime(new Date());
			stockMapper.insert(stock);
		}else{
			stock = stockMapper.selectByPrimaryKey(stockGoods.getStockId());
			float price = stock.getStockPrice();
			price += stockGoods.getGoodPrice() * stockGoods.getGoodNum();
			stock.setStockPrice(price);
			stock.setStockTime(new Date());
			stockMapper.updateByPrimaryKey(stock);
		}
		
		StockGoodsKey key = new StockGoodsKey();
		key.setGoodId(stockGoods.getGoodId());
		key.setStockId(stockGoods.getStockId());
		StockGoods goods = stockGoodsMapper.selectByPrimaryKey(key);
		if(goods!=null){
			stockGoods.setGoodNum(stockGoods.getGoodNum()+goods.getGoodNum());
			stockGoodsMapper.updateByPrimaryKey(stockGoods);
		}else{
			stockGoodsMapper.insert(stockGoods);
		}
		Good good = goodMapper.selectByPrimaryKey(stockGoods.getGoodId());
		good.setGoodNum(good.getGoodNum()+stockGoods.getGoodNum());
		good.setGoodLastTime(new Date());
		goodMapper.updateByPrimaryKey(good);
		return stockGoods.getStockId();
	}

	@Override
	public Stock getStockById(String stockId) {
		// TODO Auto-generated method stub
		return stockMapper.selectByPrimaryKey(stockId);
	}

	@Override
	public PageInfo<StockGoods> getStockGoodPageInfo(int pageNo, int pageSize, String stockId) {
		PageHelper.startPage(pageNo, pageSize);
		StockGoodsExample example = new StockGoodsExample();
		StockGoodsExample.Criteria criteria = example.createCriteria();
		criteria.andStockIdEqualTo(stockId);
		List<StockGoods> list = stockGoodsMapper.selectByExample(example);
		PageInfo<StockGoods> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

}
