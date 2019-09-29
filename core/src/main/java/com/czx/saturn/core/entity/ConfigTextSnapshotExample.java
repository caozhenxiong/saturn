package com.czx.saturn.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConfigTextSnapshotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigTextSnapshotExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNull() {
            addCriterion("config_id is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("config_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Long value) {
            addCriterion("config_id =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Long value) {
            addCriterion("config_id <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Long value) {
            addCriterion("config_id >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("config_id >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Long value) {
            addCriterion("config_id <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("config_id <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Long> values) {
            addCriterion("config_id in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Long> values) {
            addCriterion("config_id not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Long value1, Long value2) {
            addCriterion("config_id between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("config_id not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeIsNull() {
            addCriterion("namespace_code is null");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeIsNotNull() {
            addCriterion("namespace_code is not null");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeEqualTo(String value) {
            addCriterion("namespace_code =", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeNotEqualTo(String value) {
            addCriterion("namespace_code <>", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeGreaterThan(String value) {
            addCriterion("namespace_code >", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("namespace_code >=", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeLessThan(String value) {
            addCriterion("namespace_code <", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeLessThanOrEqualTo(String value) {
            addCriterion("namespace_code <=", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeLike(String value) {
            addCriterion("namespace_code like", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeNotLike(String value) {
            addCriterion("namespace_code not like", value, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeIn(List<String> values) {
            addCriterion("namespace_code in", values, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeNotIn(List<String> values) {
            addCriterion("namespace_code not in", values, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeBetween(String value1, String value2) {
            addCriterion("namespace_code between", value1, value2, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeNotBetween(String value1, String value2) {
            addCriterion("namespace_code not between", value1, value2, "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeIsNull() {
            addCriterion("env_code is null");
            return (Criteria) this;
        }

        public Criteria andEnvCodeIsNotNull() {
            addCriterion("env_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnvCodeEqualTo(String value) {
            addCriterion("env_code =", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeNotEqualTo(String value) {
            addCriterion("env_code <>", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeGreaterThan(String value) {
            addCriterion("env_code >", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("env_code >=", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeLessThan(String value) {
            addCriterion("env_code <", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeLessThanOrEqualTo(String value) {
            addCriterion("env_code <=", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeLike(String value) {
            addCriterion("env_code like", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeNotLike(String value) {
            addCriterion("env_code not like", value, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeIn(List<String> values) {
            addCriterion("env_code in", values, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeNotIn(List<String> values) {
            addCriterion("env_code not in", values, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeBetween(String value1, String value2) {
            addCriterion("env_code between", value1, value2, "envCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeNotBetween(String value1, String value2) {
            addCriterion("env_code not between", value1, value2, "envCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeIsNull() {
            addCriterion("app_code is null");
            return (Criteria) this;
        }

        public Criteria andAppCodeIsNotNull() {
            addCriterion("app_code is not null");
            return (Criteria) this;
        }

        public Criteria andAppCodeEqualTo(String value) {
            addCriterion("app_code =", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotEqualTo(String value) {
            addCriterion("app_code <>", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeGreaterThan(String value) {
            addCriterion("app_code >", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeGreaterThanOrEqualTo(String value) {
            addCriterion("app_code >=", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeLessThan(String value) {
            addCriterion("app_code <", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeLessThanOrEqualTo(String value) {
            addCriterion("app_code <=", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeLike(String value) {
            addCriterion("app_code like", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotLike(String value) {
            addCriterion("app_code not like", value, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeIn(List<String> values) {
            addCriterion("app_code in", values, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotIn(List<String> values) {
            addCriterion("app_code not in", values, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeBetween(String value1, String value2) {
            addCriterion("app_code between", value1, value2, "appCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeNotBetween(String value1, String value2) {
            addCriterion("app_code not between", value1, value2, "appCode");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionIsNull() {
            addCriterion("current_version is null");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionIsNotNull() {
            addCriterion("current_version is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionEqualTo(Integer value) {
            addCriterion("current_version =", value, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionNotEqualTo(Integer value) {
            addCriterion("current_version <>", value, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionGreaterThan(Integer value) {
            addCriterion("current_version >", value, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_version >=", value, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionLessThan(Integer value) {
            addCriterion("current_version <", value, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionLessThanOrEqualTo(Integer value) {
            addCriterion("current_version <=", value, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionIn(List<Integer> values) {
            addCriterion("current_version in", values, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionNotIn(List<Integer> values) {
            addCriterion("current_version not in", values, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionBetween(Integer value1, Integer value2) {
            addCriterion("current_version between", value1, value2, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCurrentVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("current_version not between", value1, value2, "currentVersion");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andNamespaceCodeLikeInsensitive(String value) {
            addCriterion("upper(namespace_code) like", value.toUpperCase(), "namespaceCode");
            return (Criteria) this;
        }

        public Criteria andEnvCodeLikeInsensitive(String value) {
            addCriterion("upper(env_code) like", value.toUpperCase(), "envCode");
            return (Criteria) this;
        }

        public Criteria andAppCodeLikeInsensitive(String value) {
            addCriterion("upper(app_code) like", value.toUpperCase(), "appCode");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(operator) like", value.toUpperCase(), "operator");
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