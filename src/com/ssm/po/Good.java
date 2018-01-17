package com.ssm.po;

import java.util.Date;

public class Good {
    private String goodId;

    private String goodName;

    private String goodType;

    private Float goodPrice;

    private String goodFlag;

    private Integer goodNum;

    private Date goodLastTime;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType == null ? null : goodType.trim();
    }

    public Float getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Float goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodFlag() {
        return goodFlag;
    }

    public void setGoodFlag(String goodFlag) {
        this.goodFlag = goodFlag == null ? null : goodFlag.trim();
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public Date getGoodLastTime() {
        return goodLastTime;
    }

    public void setGoodLastTime(Date goodLastTime) {
        this.goodLastTime = goodLastTime;
    }
}