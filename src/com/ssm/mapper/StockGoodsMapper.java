package com.ssm.mapper;

import com.ssm.po.StockGoods;
import com.ssm.po.StockGoodsExample;
import com.ssm.po.StockGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockGoodsMapper {
    int countByExample(StockGoodsExample example);

    int deleteByExample(StockGoodsExample example);

    int deleteByPrimaryKey(StockGoodsKey key);

    int insert(StockGoods record);

    int insertSelective(StockGoods record);

    List<StockGoods> selectByExample(StockGoodsExample example);

    StockGoods selectByPrimaryKey(StockGoodsKey key);

    int updateByExampleSelective(@Param("record") StockGoods record, @Param("example") StockGoodsExample example);

    int updateByExample(@Param("record") StockGoods record, @Param("example") StockGoodsExample example);

    int updateByPrimaryKeySelective(StockGoods record);

    int updateByPrimaryKey(StockGoods record);
}