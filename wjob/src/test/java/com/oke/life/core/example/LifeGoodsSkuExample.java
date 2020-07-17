package com.oke.life.core.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LifeGoodsSkuExample {
    /**
     * life_goods_sku
     */
    protected String orderByClause;

    /**
     * life_goods_sku
     */
    protected boolean distinct;

    /**
     * life_goods_sku
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public LifeGoodsSkuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * life_goods_sku null
     */
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSkuSnIsNull() {
            addCriterion("sku_sn is null");
            return (Criteria) this;
        }

        public Criteria andSkuSnIsNotNull() {
            addCriterion("sku_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSnEqualTo(String value) {
            addCriterion("sku_sn =", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotEqualTo(String value) {
            addCriterion("sku_sn <>", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnGreaterThan(String value) {
            addCriterion("sku_sn >", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnGreaterThanOrEqualTo(String value) {
            addCriterion("sku_sn >=", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnLessThan(String value) {
            addCriterion("sku_sn <", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnLessThanOrEqualTo(String value) {
            addCriterion("sku_sn <=", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnLike(String value) {
            addCriterion("sku_sn like", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotLike(String value) {
            addCriterion("sku_sn not like", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnIn(List<String> values) {
            addCriterion("sku_sn in", values, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotIn(List<String> values) {
            addCriterion("sku_sn not in", values, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnBetween(String value1, String value2) {
            addCriterion("sku_sn between", value1, value2, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotBetween(String value1, String value2) {
            addCriterion("sku_sn not between", value1, value2, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuNoIsNull() {
            addCriterion("sku_no is null");
            return (Criteria) this;
        }

        public Criteria andSkuNoIsNotNull() {
            addCriterion("sku_no is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNoEqualTo(String value) {
            addCriterion("sku_no =", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotEqualTo(String value) {
            addCriterion("sku_no <>", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoGreaterThan(String value) {
            addCriterion("sku_no >", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoGreaterThanOrEqualTo(String value) {
            addCriterion("sku_no >=", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoLessThan(String value) {
            addCriterion("sku_no <", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoLessThanOrEqualTo(String value) {
            addCriterion("sku_no <=", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoLike(String value) {
            addCriterion("sku_no like", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotLike(String value) {
            addCriterion("sku_no not like", value, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoIn(List<String> values) {
            addCriterion("sku_no in", values, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotIn(List<String> values) {
            addCriterion("sku_no not in", values, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoBetween(String value1, String value2) {
            addCriterion("sku_no between", value1, value2, "skuNo");
            return (Criteria) this;
        }

        public Criteria andSkuNoNotBetween(String value1, String value2) {
            addCriterion("sku_no not between", value1, value2, "skuNo");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsIsNull() {
            addCriterion("goods_spec_val_ids is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsIsNotNull() {
            addCriterion("goods_spec_val_ids is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsEqualTo(String value) {
            addCriterion("goods_spec_val_ids =", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsNotEqualTo(String value) {
            addCriterion("goods_spec_val_ids <>", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsGreaterThan(String value) {
            addCriterion("goods_spec_val_ids >", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_spec_val_ids >=", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsLessThan(String value) {
            addCriterion("goods_spec_val_ids <", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsLessThanOrEqualTo(String value) {
            addCriterion("goods_spec_val_ids <=", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsLike(String value) {
            addCriterion("goods_spec_val_ids like", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsNotLike(String value) {
            addCriterion("goods_spec_val_ids not like", value, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsIn(List<String> values) {
            addCriterion("goods_spec_val_ids in", values, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsNotIn(List<String> values) {
            addCriterion("goods_spec_val_ids not in", values, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsBetween(String value1, String value2) {
            addCriterion("goods_spec_val_ids between", value1, value2, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecValIdsNotBetween(String value1, String value2) {
            addCriterion("goods_spec_val_ids not between", value1, value2, "goodsSpecValIds");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceIsNull() {
            addCriterion("spec_price is null");
            return (Criteria) this;
        }

        public Criteria andSpecPriceIsNotNull() {
            addCriterion("spec_price is not null");
            return (Criteria) this;
        }

        public Criteria andSpecPriceEqualTo(BigDecimal value) {
            addCriterion("spec_price =", value, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceNotEqualTo(BigDecimal value) {
            addCriterion("spec_price <>", value, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceGreaterThan(BigDecimal value) {
            addCriterion("spec_price >", value, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_price >=", value, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceLessThan(BigDecimal value) {
            addCriterion("spec_price <", value, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_price <=", value, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceIn(List<BigDecimal> values) {
            addCriterion("spec_price in", values, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceNotIn(List<BigDecimal> values) {
            addCriterion("spec_price not in", values, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_price between", value1, value2, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_price not between", value1, value2, "specPrice");
            return (Criteria) this;
        }

        public Criteria andSpecStockIsNull() {
            addCriterion("spec_stock is null");
            return (Criteria) this;
        }

        public Criteria andSpecStockIsNotNull() {
            addCriterion("spec_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSpecStockEqualTo(Integer value) {
            addCriterion("spec_stock =", value, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockNotEqualTo(Integer value) {
            addCriterion("spec_stock <>", value, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockGreaterThan(Integer value) {
            addCriterion("spec_stock >", value, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("spec_stock >=", value, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockLessThan(Integer value) {
            addCriterion("spec_stock <", value, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockLessThanOrEqualTo(Integer value) {
            addCriterion("spec_stock <=", value, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockIn(List<Integer> values) {
            addCriterion("spec_stock in", values, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockNotIn(List<Integer> values) {
            addCriterion("spec_stock not in", values, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockBetween(Integer value1, Integer value2) {
            addCriterion("spec_stock between", value1, value2, "specStock");
            return (Criteria) this;
        }

        public Criteria andSpecStockNotBetween(Integer value1, Integer value2) {
            addCriterion("spec_stock not between", value1, value2, "specStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockIsNull() {
            addCriterion("warn_stock is null");
            return (Criteria) this;
        }

        public Criteria andWarnStockIsNotNull() {
            addCriterion("warn_stock is not null");
            return (Criteria) this;
        }

        public Criteria andWarnStockEqualTo(Integer value) {
            addCriterion("warn_stock =", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotEqualTo(Integer value) {
            addCriterion("warn_stock <>", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThan(Integer value) {
            addCriterion("warn_stock >", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_stock >=", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThan(Integer value) {
            addCriterion("warn_stock <", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThanOrEqualTo(Integer value) {
            addCriterion("warn_stock <=", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockIn(List<Integer> values) {
            addCriterion("warn_stock in", values, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotIn(List<Integer> values) {
            addCriterion("warn_stock not in", values, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockBetween(Integer value1, Integer value2) {
            addCriterion("warn_stock between", value1, value2, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_stock not between", value1, value2, "warnStock");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNull() {
            addCriterion("sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(Integer value) {
            addCriterion("sale_num =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(Integer value) {
            addCriterion("sale_num <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(Integer value) {
            addCriterion("sale_num >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_num >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(Integer value) {
            addCriterion("sale_num <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("sale_num <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<Integer> values) {
            addCriterion("sale_num in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<Integer> values) {
            addCriterion("sale_num not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("sale_num between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_num not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andInitSpecIsNull() {
            addCriterion("init_spec is null");
            return (Criteria) this;
        }

        public Criteria andInitSpecIsNotNull() {
            addCriterion("init_spec is not null");
            return (Criteria) this;
        }

        public Criteria andInitSpecEqualTo(Integer value) {
            addCriterion("init_spec =", value, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecNotEqualTo(Integer value) {
            addCriterion("init_spec <>", value, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecGreaterThan(Integer value) {
            addCriterion("init_spec >", value, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecGreaterThanOrEqualTo(Integer value) {
            addCriterion("init_spec >=", value, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecLessThan(Integer value) {
            addCriterion("init_spec <", value, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecLessThanOrEqualTo(Integer value) {
            addCriterion("init_spec <=", value, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecIn(List<Integer> values) {
            addCriterion("init_spec in", values, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecNotIn(List<Integer> values) {
            addCriterion("init_spec not in", values, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecBetween(Integer value1, Integer value2) {
            addCriterion("init_spec between", value1, value2, "initSpec");
            return (Criteria) this;
        }

        public Criteria andInitSpecNotBetween(Integer value1, Integer value2) {
            addCriterion("init_spec not between", value1, value2, "initSpec");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Integer value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Integer value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Integer value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Integer value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Integer value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Integer> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Integer> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Integer value1, Integer value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Integer value1, Integer value2) {
            addCriterion("del not between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andSpecWeightIsNull() {
            addCriterion("spec_weight is null");
            return (Criteria) this;
        }

        public Criteria andSpecWeightIsNotNull() {
            addCriterion("spec_weight is not null");
            return (Criteria) this;
        }

        public Criteria andSpecWeightEqualTo(BigDecimal value) {
            addCriterion("spec_weight =", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightNotEqualTo(BigDecimal value) {
            addCriterion("spec_weight <>", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightGreaterThan(BigDecimal value) {
            addCriterion("spec_weight >", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_weight >=", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightLessThan(BigDecimal value) {
            addCriterion("spec_weight <", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_weight <=", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightIn(List<BigDecimal> values) {
            addCriterion("spec_weight in", values, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightNotIn(List<BigDecimal> values) {
            addCriterion("spec_weight not in", values, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_weight between", value1, value2, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_weight not between", value1, value2, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeIsNull() {
            addCriterion("spec_volume is null");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeIsNotNull() {
            addCriterion("spec_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeEqualTo(BigDecimal value) {
            addCriterion("spec_volume =", value, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeNotEqualTo(BigDecimal value) {
            addCriterion("spec_volume <>", value, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeGreaterThan(BigDecimal value) {
            addCriterion("spec_volume >", value, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_volume >=", value, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeLessThan(BigDecimal value) {
            addCriterion("spec_volume <", value, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spec_volume <=", value, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeIn(List<BigDecimal> values) {
            addCriterion("spec_volume in", values, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeNotIn(List<BigDecimal> values) {
            addCriterion("spec_volume not in", values, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_volume between", value1, value2, "specVolume");
            return (Criteria) this;
        }

        public Criteria andSpecVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spec_volume not between", value1, value2, "specVolume");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }
    }

    /**
     * life_goods_sku
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * life_goods_sku null
     */
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