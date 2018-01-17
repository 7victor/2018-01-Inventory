package com.ssm.mapper;

import com.ssm.po.GoodType;
import com.ssm.po.GoodTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodTypeMapper {
    int countByExample(GoodTypeExample example);

    int deleteByExample(GoodTypeExample example);

    int deleteByPrimaryKey(String typeId);

    int insert(GoodType record);

    int insertSelective(GoodType record);

    List<GoodType> selectByExample(GoodTypeExample example);

    GoodType selectByPrimaryKey(String typeId);

    int updateByExampleSelective(@Param("record") GoodType record, @Param("example") GoodTypeExample example);

    int updateByExample(@Param("record") GoodType record, @Param("example") GoodTypeExample example);

    int updateByPrimaryKeySelective(GoodType record);

    int updateByPrimaryKey(GoodType record);
}