package com.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodTypeExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeMessIsNull() {
            addCriterion("type_mess is null");
            return (Criteria) this;
        }

        public Criteria andTypeMessIsNotNull() {
            addCriterion("type_mess is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMessEqualTo(String value) {
            addCriterion("type_mess =", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessNotEqualTo(String value) {
            addCriterion("type_mess <>", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessGreaterThan(String value) {
            addCriterion("type_mess >", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessGreaterThanOrEqualTo(String value) {
            addCriterion("type_mess >=", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessLessThan(String value) {
            addCriterion("type_mess <", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessLessThanOrEqualTo(String value) {
            addCriterion("type_mess <=", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessLike(String value) {
            addCriterion("type_mess like", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessNotLike(String value) {
            addCriterion("type_mess not like", value, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessIn(List<String> values) {
            addCriterion("type_mess in", values, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessNotIn(List<String> values) {
            addCriterion("type_mess not in", values, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessBetween(String value1, String value2) {
            addCriterion("type_mess between", value1, value2, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeMessNotBetween(String value1, String value2) {
            addCriterion("type_mess not between", value1, value2, "typeMess");
            return (Criteria) this;
        }

        public Criteria andTypeTimeIsNull() {
            addCriterion("type_time is null");
            return (Criteria) this;
        }

        public Criteria andTypeTimeIsNotNull() {
            addCriterion("type_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTimeEqualTo(Date value) {
            addCriterion("type_time =", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeNotEqualTo(Date value) {
            addCriterion("type_time <>", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeGreaterThan(Date value) {
            addCriterion("type_time >", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("type_time >=", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeLessThan(Date value) {
            addCriterion("type_time <", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeLessThanOrEqualTo(Date value) {
            addCriterion("type_time <=", value, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeIn(List<Date> values) {
            addCriterion("type_time in", values, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeNotIn(List<Date> values) {
            addCriterion("type_time not in", values, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeBetween(Date value1, Date value2) {
            addCriterion("type_time between", value1, value2, "typeTime");
            return (Criteria) this;
        }

        public Criteria andTypeTimeNotBetween(Date value1, Date value2) {
            addCriterion("type_time not between", value1, value2, "typeTime");
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