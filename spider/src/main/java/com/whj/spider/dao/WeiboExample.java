package com.whj.spider.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WeiboExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeiboExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andFansnumIsNull() {
            addCriterion("fansNum is null");
            return (Criteria) this;
        }

        public Criteria andFansnumIsNotNull() {
            addCriterion("fansNum is not null");
            return (Criteria) this;
        }

        public Criteria andFansnumEqualTo(Integer value) {
            addCriterion("fansNum =", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumNotEqualTo(Integer value) {
            addCriterion("fansNum <>", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumGreaterThan(Integer value) {
            addCriterion("fansNum >", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fansNum >=", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumLessThan(Integer value) {
            addCriterion("fansNum <", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumLessThanOrEqualTo(Integer value) {
            addCriterion("fansNum <=", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumIn(List<Integer> values) {
            addCriterion("fansNum in", values, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumNotIn(List<Integer> values) {
            addCriterion("fansNum not in", values, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumBetween(Integer value1, Integer value2) {
            addCriterion("fansNum between", value1, value2, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumNotBetween(Integer value1, Integer value2) {
            addCriterion("fansNum not between", value1, value2, "fansnum");
            return (Criteria) this;
        }

        public Criteria andBlognumIsNull() {
            addCriterion("blogNum is null");
            return (Criteria) this;
        }

        public Criteria andBlognumIsNotNull() {
            addCriterion("blogNum is not null");
            return (Criteria) this;
        }

        public Criteria andBlognumEqualTo(Integer value) {
            addCriterion("blogNum =", value, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumNotEqualTo(Integer value) {
            addCriterion("blogNum <>", value, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumGreaterThan(Integer value) {
            addCriterion("blogNum >", value, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogNum >=", value, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumLessThan(Integer value) {
            addCriterion("blogNum <", value, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumLessThanOrEqualTo(Integer value) {
            addCriterion("blogNum <=", value, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumIn(List<Integer> values) {
            addCriterion("blogNum in", values, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumNotIn(List<Integer> values) {
            addCriterion("blogNum not in", values, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumBetween(Integer value1, Integer value2) {
            addCriterion("blogNum between", value1, value2, "blognum");
            return (Criteria) this;
        }

        public Criteria andBlognumNotBetween(Integer value1, Integer value2) {
            addCriterion("blogNum not between", value1, value2, "blognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumIsNull() {
            addCriterion("originalBlogNum is null");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumIsNotNull() {
            addCriterion("originalBlogNum is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumEqualTo(Integer value) {
            addCriterion("originalBlogNum =", value, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumNotEqualTo(Integer value) {
            addCriterion("originalBlogNum <>", value, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumGreaterThan(Integer value) {
            addCriterion("originalBlogNum >", value, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumGreaterThanOrEqualTo(Integer value) {
            addCriterion("originalBlogNum >=", value, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumLessThan(Integer value) {
            addCriterion("originalBlogNum <", value, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumLessThanOrEqualTo(Integer value) {
            addCriterion("originalBlogNum <=", value, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumIn(List<Integer> values) {
            addCriterion("originalBlogNum in", values, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumNotIn(List<Integer> values) {
            addCriterion("originalBlogNum not in", values, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumBetween(Integer value1, Integer value2) {
            addCriterion("originalBlogNum between", value1, value2, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andOriginalblognumNotBetween(Integer value1, Integer value2) {
            addCriterion("originalBlogNum not between", value1, value2, "originalblognum");
            return (Criteria) this;
        }

        public Criteria andFollownumIsNull() {
            addCriterion("followNum is null");
            return (Criteria) this;
        }

        public Criteria andFollownumIsNotNull() {
            addCriterion("followNum is not null");
            return (Criteria) this;
        }

        public Criteria andFollownumEqualTo(Integer value) {
            addCriterion("followNum =", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotEqualTo(Integer value) {
            addCriterion("followNum <>", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumGreaterThan(Integer value) {
            addCriterion("followNum >", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("followNum >=", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumLessThan(Integer value) {
            addCriterion("followNum <", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumLessThanOrEqualTo(Integer value) {
            addCriterion("followNum <=", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumIn(List<Integer> values) {
            addCriterion("followNum in", values, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotIn(List<Integer> values) {
            addCriterion("followNum not in", values, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumBetween(Integer value1, Integer value2) {
            addCriterion("followNum between", value1, value2, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotBetween(Integer value1, Integer value2) {
            addCriterion("followNum not between", value1, value2, "follownum");
            return (Criteria) this;
        }

        public Criteria andHomelinkIsNull() {
            addCriterion("homeLink is null");
            return (Criteria) this;
        }

        public Criteria andHomelinkIsNotNull() {
            addCriterion("homeLink is not null");
            return (Criteria) this;
        }

        public Criteria andHomelinkEqualTo(String value) {
            addCriterion("homeLink =", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkNotEqualTo(String value) {
            addCriterion("homeLink <>", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkGreaterThan(String value) {
            addCriterion("homeLink >", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkGreaterThanOrEqualTo(String value) {
            addCriterion("homeLink >=", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkLessThan(String value) {
            addCriterion("homeLink <", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkLessThanOrEqualTo(String value) {
            addCriterion("homeLink <=", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkLike(String value) {
            addCriterion("homeLink like", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkNotLike(String value) {
            addCriterion("homeLink not like", value, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkIn(List<String> values) {
            addCriterion("homeLink in", values, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkNotIn(List<String> values) {
            addCriterion("homeLink not in", values, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkBetween(String value1, String value2) {
            addCriterion("homeLink between", value1, value2, "homelink");
            return (Criteria) this;
        }

        public Criteria andHomelinkNotBetween(String value1, String value2) {
            addCriterion("homeLink not between", value1, value2, "homelink");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNull() {
            addCriterion("registrationTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNotNull() {
            addCriterion("registrationTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime =", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime <>", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("registrationTime >", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime >=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThan(Date value) {
            addCriterionForJDBCDate("registrationTime <", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime <=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIn(List<Date> values) {
            addCriterionForJDBCDate("registrationTime in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("registrationTime not in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrationTime between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrationTime not between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateIsNull() {
            addCriterion("blogAuthenticate is null");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateIsNotNull() {
            addCriterion("blogAuthenticate is not null");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateEqualTo(String value) {
            addCriterion("blogAuthenticate =", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateNotEqualTo(String value) {
            addCriterion("blogAuthenticate <>", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateGreaterThan(String value) {
            addCriterion("blogAuthenticate >", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateGreaterThanOrEqualTo(String value) {
            addCriterion("blogAuthenticate >=", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateLessThan(String value) {
            addCriterion("blogAuthenticate <", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateLessThanOrEqualTo(String value) {
            addCriterion("blogAuthenticate <=", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateLike(String value) {
            addCriterion("blogAuthenticate like", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateNotLike(String value) {
            addCriterion("blogAuthenticate not like", value, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateIn(List<String> values) {
            addCriterion("blogAuthenticate in", values, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateNotIn(List<String> values) {
            addCriterion("blogAuthenticate not in", values, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateBetween(String value1, String value2) {
            addCriterion("blogAuthenticate between", value1, value2, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andBlogauthenticateNotBetween(String value1, String value2) {
            addCriterion("blogAuthenticate not between", value1, value2, "blogauthenticate");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andBciIsNull() {
            addCriterion("BCI is null");
            return (Criteria) this;
        }

        public Criteria andBciIsNotNull() {
            addCriterion("BCI is not null");
            return (Criteria) this;
        }

        public Criteria andBciEqualTo(String value) {
            addCriterion("BCI =", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciNotEqualTo(String value) {
            addCriterion("BCI <>", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciGreaterThan(String value) {
            addCriterion("BCI >", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciGreaterThanOrEqualTo(String value) {
            addCriterion("BCI >=", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciLessThan(String value) {
            addCriterion("BCI <", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciLessThanOrEqualTo(String value) {
            addCriterion("BCI <=", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciLike(String value) {
            addCriterion("BCI like", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciNotLike(String value) {
            addCriterion("BCI not like", value, "bci");
            return (Criteria) this;
        }

        public Criteria andBciIn(List<String> values) {
            addCriterion("BCI in", values, "bci");
            return (Criteria) this;
        }

        public Criteria andBciNotIn(List<String> values) {
            addCriterion("BCI not in", values, "bci");
            return (Criteria) this;
        }

        public Criteria andBciBetween(String value1, String value2) {
            addCriterion("BCI between", value1, value2, "bci");
            return (Criteria) this;
        }

        public Criteria andBciNotBetween(String value1, String value2) {
            addCriterion("BCI not between", value1, value2, "bci");
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