package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuAddressIsNull() {
            addCriterion("menu_address is null");
            return (Criteria) this;
        }

        public Criteria andMenuAddressIsNotNull() {
            addCriterion("menu_address is not null");
            return (Criteria) this;
        }

        public Criteria andMenuAddressEqualTo(String value) {
            addCriterion("menu_address =", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressNotEqualTo(String value) {
            addCriterion("menu_address <>", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressGreaterThan(String value) {
            addCriterion("menu_address >", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("menu_address >=", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressLessThan(String value) {
            addCriterion("menu_address <", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressLessThanOrEqualTo(String value) {
            addCriterion("menu_address <=", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressLike(String value) {
            addCriterion("menu_address like", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressNotLike(String value) {
            addCriterion("menu_address not like", value, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressIn(List<String> values) {
            addCriterion("menu_address in", values, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressNotIn(List<String> values) {
            addCriterion("menu_address not in", values, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressBetween(String value1, String value2) {
            addCriterion("menu_address between", value1, value2, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuAddressNotBetween(String value1, String value2) {
            addCriterion("menu_address not between", value1, value2, "menuAddress");
            return (Criteria) this;
        }

        public Criteria andMenuFlagIsNull() {
            addCriterion("menu_flag is null");
            return (Criteria) this;
        }

        public Criteria andMenuFlagIsNotNull() {
            addCriterion("menu_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMenuFlagEqualTo(String value) {
            addCriterion("menu_flag =", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotEqualTo(String value) {
            addCriterion("menu_flag <>", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagGreaterThan(String value) {
            addCriterion("menu_flag >", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagGreaterThanOrEqualTo(String value) {
            addCriterion("menu_flag >=", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagLessThan(String value) {
            addCriterion("menu_flag <", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagLessThanOrEqualTo(String value) {
            addCriterion("menu_flag <=", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagLike(String value) {
            addCriterion("menu_flag like", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotLike(String value) {
            addCriterion("menu_flag not like", value, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagIn(List<String> values) {
            addCriterion("menu_flag in", values, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotIn(List<String> values) {
            addCriterion("menu_flag not in", values, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagBetween(String value1, String value2) {
            addCriterion("menu_flag between", value1, value2, "menuFlag");
            return (Criteria) this;
        }

        public Criteria andMenuFlagNotBetween(String value1, String value2) {
            addCriterion("menu_flag not between", value1, value2, "menuFlag");
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