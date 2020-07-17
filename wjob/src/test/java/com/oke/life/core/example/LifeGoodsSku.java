package com.oke.life.core.example;

import java.math.BigDecimal;
import java.util.Date;

public class LifeGoodsSku {
    /**
     * 
     */
    private Long id;

    /**
     * 店铺 id
     */
    private Long shopId;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 平台生成编号
     */
    private String skuSn;

    /**
     * 货品编号
     */
    private String skuNo;

    /**
     * 规格关系表id例如：goods_spec_val_id:goods_spec_val_ids:goods_spec_val_ids
     */
    private String goodsSpecValIds;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 商品价格
     */
    private BigDecimal specPrice;

    /**
     * 库存
     */
    private Integer specStock;

    /**
     * 预警值
     */
    private Integer warnStock;

    /**
     * 销量
     */
    private Integer saleNum;

    /**
     * 默认规格1默认规格0非默认规格
     */
    private Integer initSpec;

    /**
     * 删除(0否1是)
     */
    private Integer del;

    /**
     * 商品重量
     */
    private BigDecimal specWeight;

    /**
     * 商品体积
     */
    private BigDecimal specVolume;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 商品图片
     */
    private String goodsImg;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 店铺 id
     * @return shop_id 店铺 id
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * 店铺 id
     * @param shopId 店铺 id
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * 商品id
     * @return goods_id 商品id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id
     * @param goodsId 商品id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 平台生成编号
     * @return sku_sn 平台生成编号
     */
    public String getSkuSn() {
        return skuSn;
    }

    /**
     * 平台生成编号
     * @param skuSn 平台生成编号
     */
    public void setSkuSn(String skuSn) {
        this.skuSn = skuSn == null ? null : skuSn.trim();
    }

    /**
     * 货品编号
     * @return sku_no 货品编号
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * 货品编号
     * @param skuNo 货品编号
     */
    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo == null ? null : skuNo.trim();
    }

    /**
     * 规格关系表id例如：goods_spec_val_id:goods_spec_val_ids:goods_spec_val_ids
     * @return goods_spec_val_ids 规格关系表id例如：goods_spec_val_id:goods_spec_val_ids:goods_spec_val_ids
     */
    public String getGoodsSpecValIds() {
        return goodsSpecValIds;
    }

    /**
     * 规格关系表id例如：goods_spec_val_id:goods_spec_val_ids:goods_spec_val_ids
     * @param goodsSpecValIds 规格关系表id例如：goods_spec_val_id:goods_spec_val_ids:goods_spec_val_ids
     */
    public void setGoodsSpecValIds(String goodsSpecValIds) {
        this.goodsSpecValIds = goodsSpecValIds == null ? null : goodsSpecValIds.trim();
    }

    /**
     * 市场价
     * @return market_price 市场价
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * 市场价
     * @param marketPrice 市场价
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 商品价格
     * @return spec_price 商品价格
     */
    public BigDecimal getSpecPrice() {
        return specPrice;
    }

    /**
     * 商品价格
     * @param specPrice 商品价格
     */
    public void setSpecPrice(BigDecimal specPrice) {
        this.specPrice = specPrice;
    }

    /**
     * 库存
     * @return spec_stock 库存
     */
    public Integer getSpecStock() {
        return specStock;
    }

    /**
     * 库存
     * @param specStock 库存
     */
    public void setSpecStock(Integer specStock) {
        this.specStock = specStock;
    }

    /**
     * 预警值
     * @return warn_stock 预警值
     */
    public Integer getWarnStock() {
        return warnStock;
    }

    /**
     * 预警值
     * @param warnStock 预警值
     */
    public void setWarnStock(Integer warnStock) {
        this.warnStock = warnStock;
    }

    /**
     * 销量
     * @return sale_num 销量
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * 销量
     * @param saleNum 销量
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * 默认规格1默认规格0非默认规格
     * @return init_spec 默认规格1默认规格0非默认规格
     */
    public Integer getInitSpec() {
        return initSpec;
    }

    /**
     * 默认规格1默认规格0非默认规格
     * @param initSpec 默认规格1默认规格0非默认规格
     */
    public void setInitSpec(Integer initSpec) {
        this.initSpec = initSpec;
    }

    /**
     * 删除(0否1是)
     * @return del 删除(0否1是)
     */
    public Integer getDel() {
        return del;
    }

    /**
     * 删除(0否1是)
     * @param del 删除(0否1是)
     */
    public void setDel(Integer del) {
        this.del = del;
    }

    /**
     * 商品重量
     * @return spec_weight 商品重量
     */
    public BigDecimal getSpecWeight() {
        return specWeight;
    }

    /**
     * 商品重量
     * @param specWeight 商品重量
     */
    public void setSpecWeight(BigDecimal specWeight) {
        this.specWeight = specWeight;
    }

    /**
     * 商品体积
     * @return spec_volume 商品体积
     */
    public BigDecimal getSpecVolume() {
        return specVolume;
    }

    /**
     * 商品体积
     * @param specVolume 商品体积
     */
    public void setSpecVolume(BigDecimal specVolume) {
        this.specVolume = specVolume;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 商品图片
     * @return goods_img 商品图片
     */
    public String getGoodsImg() {
        return goodsImg;
    }

    /**
     * 商品图片
     * @param goodsImg 商品图片
     */
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }
}