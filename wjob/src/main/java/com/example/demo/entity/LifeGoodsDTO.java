package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Author: wangjiangbo
 * Date: 2019/12/23 15:42
 * Description:聚联惠商品(添加)
 */
@Data
@ApiModel("聚联惠商品(添加)")
public class LifeGoodsDTO {

    @ApiModelProperty(name = "id",value = "商品id",dataType = "long")
    private Long id;
    @ApiModelProperty(name = "shopId",value = "店铺id",dataType = "long")
    private Long shopId;
    @ApiModelProperty(name = "categoryId",value = "经营类别id(最后一级分类)",dataType = "int")
    private Integer categoryId;
    @ApiModelProperty(name = "categoryPath",value = "分类路径(catId1_catId2)",dataType = "string")
    private String categoryPath;
    @ApiModelProperty(name = "goodsImg",value = "商品图片(url,url)",dataType = "string")
    private String goodsImg;
    @ApiModelProperty(name = "goodsImgs",value = "商品图片",dataType = "list")
    private List <String> goodsImgs;

    @ApiModelProperty(name = "goodsName",value = "商品名称",dataType = "string")
    private String goodsName;
    @ApiModelProperty(name = "groupId",value = "组id",dataType = "long")
    private Long groupId;
//    @ApiModelProperty(name = "lifeGoodsAttributesRelas",value = "商品属性关联")
//    private List<LifeGoodsAttributesRela> lifeGoodsAttributesRelas;
//    @ApiModelProperty(name = "lifeGoodsSpecValRelas",value = "商品规格/销售信息关联")
//    private List<LifeGoodsSpecValRela> lifeGoodsSpecValRelas;
//    @ApiModelProperty(name = "lifeGoodsSkus",value = "商品销售规格")
//    private List<LifeGoodsSku> lifeGoodsSkus;

    @ApiModelProperty(name = "marketPrice",value = "原价(市场价)",dataType = "bigDecimal")
    private BigDecimal marketPrice;
    @ApiModelProperty(name = "shopPrice",value = "价格",dataType = "bigDecimal")
    private BigDecimal shopPrice;
    @ApiModelProperty(name = "goodsStock",value = "总库存",dataType = "int")
    private Integer goodsStock;
    @ApiModelProperty(name = "goodsUnit",value = "单位",dataType = "string")
    private String goodsUnit;
    @ApiModelProperty(name = "goodsSn",value = "商品编号(平台生成)",dataType = "string")
    private String goodsSn;
    @ApiModelProperty(name = "goodsNo",value = "货品编码",dataType = "string")
    private String goodsNo;
    @ApiModelProperty(name = "saleStatus",value = "上下架(0下架1上架)",dataType = "int")
    private Integer saleStatus;
    @ApiModelProperty(name = "goodsStatus",value = "商品状态-1违规0未审核1已审核",dataType = "int")
    private Integer goodsStatus;
    @ApiModelProperty(name = "saleNum",value = "销售总量",dataType = "int")
    private Integer saleNum;
    @ApiModelProperty(name = "saleTime",value = "上架时间",dataType = "date")
    private Date saleTime;
    @ApiModelProperty(name = "specOrNot",value = "是否有规格(0否1是)",dataType = "int")
    private Integer specOrNot;
    @ApiModelProperty(name = "buyNumFlag",value = "起购限购量限制标识(0默认, 1自定义)",dataType = "int")
    private Integer buyNumFlag;
    @ApiModelProperty(name = "bugNumMin",value = "起购量",dataType = "int")
    private Integer bugNumMin;
    @ApiModelProperty(name = "buyNumMax",value = "限购量",dataType = "int")
    private Integer buyNumMax;
    @ApiModelProperty(name = "serverWeek",value = "服务日期(0-默认, 1-一个星期 2-两个星期)",dataType = "int")
    private Integer serverWeek;
    @ApiModelProperty(name = "serverTime",value = "服务时间(包含一个或者多个时间段)",dataType = "string")
    private String serverTime;
    @ApiModelProperty(name = "createTime",value = "创建时间",dataType = "date")
    private Date createTime;
    @ApiModelProperty(name = "modifyTime",value = "更新时间",dataType = "date")
    private Date modifyTime;
    @ApiModelProperty(name = "del",value = "是否删除（0未删除，1删除）",dataType = "int")
    private Integer del;



}
