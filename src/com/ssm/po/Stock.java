package com.ssm.po;

import java.util.Date;

public class Stock {
    private String stockId;

    private Float stockPrice;

    private String stockMess;

    private Date stockTime;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public Float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Float stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getStockMess() {
        return stockMess;
    }

    public void setStockMess(String stockMess) {
        this.stockMess = stockMess == null ? null : stockMess.trim();
    }

    public Date getStockTime() {
        return stockTime;
    }

    public void setStockTime(Date stockTime) {
        this.stockTime = stockTime;
    }
}