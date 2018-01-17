package com.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(String value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(String value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(String value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(String value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(String value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLike(String value) {
            addCriterion("stock_id like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotLike(String value) {
            addCriterion("stock_id not like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<String> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<String> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(String value1, String value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(String value1, String value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNull() {
            addCriterion("stock_price is null");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNotNull() {
            addCriterion("stock_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockPriceEqualTo(Float value) {
            addCriterion("stock_price =", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotEqualTo(Float value) {
            addCriterion("stock_price <>", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThan(Float value) {
            addCriterion("stock_price >", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("stock_price >=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThan(Float value) {
            addCriterion("stock_price <", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThanOrEqualTo(Float value) {
            addCriterion("stock_price <=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceIn(List<Float> values) {
            addCriterion("stock_price in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotIn(List<Float> values) {
            addCriterion("stock_price not in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceBetween(Float value1, Float value2) {
            addCriterion("stock_price between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotBetween(Float value1, Float value2) {
            addCriterion("stock_price not between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockMessIsNull() {
            addCriterion("stock_mess is null");
            return (Criteria) this;
        }

        public Criteria andStockMessIsNotNull() {
            addCriterion("stock_mess is not null");
            return (Criteria) this;
        }

        public Criteria andStockMessEqualTo(String value) {
            addCriterion("stock_mess =", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessNotEqualTo(String value) {
            addCriterion("stock_mess <>", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessGreaterThan(String value) {
            addCriterion("stock_mess >", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessGreaterThanOrEqualTo(String value) {
            addCriterion("stock_mess >=", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessLessThan(String value) {
            addCriterion("stock_mess <", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessLessThanOrEqualTo(String value) {
            addCriterion("stock_mess <=", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessLike(String value) {
            addCriterion("stock_mess like", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessNotLike(String value) {
            addCriterion("stock_mess not like", value, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessIn(List<String> values) {
            addCriterion("stock_mess in", values, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessNotIn(List<String> values) {
            addCriterion("stock_mess not in", values, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessBetween(String value1, String value2) {
            addCriterion("stock_mess between", value1, value2, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockMessNotBetween(String value1, String value2) {
            addCriterion("stock_mess not between", value1, value2, "stockMess");
            return (Criteria) this;
        }

        public Criteria andStockTimeIsNull() {
            addCriterion("stock_time is null");
            return (Criteria) this;
        }

        public Criteria andStockTimeIsNotNull() {
            addCriterion("stock_time is not null");
            return (Criteria) this;
        }

        public Criteria andStockTimeEqualTo(Date value) {
            addCriterion("stock_time =", value, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeNotEqualTo(Date value) {
            addCriterion("stock_time <>", value, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeGreaterThan(Date value) {
            addCriterion("stock_time >", value, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stock_time >=", value, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeLessThan(Date value) {
            addCriterion("stock_time <", value, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeLessThanOrEqualTo(Date value) {
            addCriterion("stock_time <=", value, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeIn(List<Date> values) {
            addCriterion("stock_time in", values, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeNotIn(List<Date> values) {
            addCriterion("stock_time not in", values, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeBetween(Date value1, Date value2) {
            addCriterion("stock_time between", value1, value2, "stockTime");
            return (Criteria) this;
        }

        public Criteria andStockTimeNotBetween(Date value1, Date value2) {
            addCriterion("stock_time not between", value1, value2, "stockTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}