package com.example.demo.enumConstant;

/**
 * Created by wangjiangbo on 2020/10/20
 */
public class LifeEnum {

    /***
     * 装修房屋的类型
     * 1新房/2旧房/3局部4软装
     */
    public enum HouseTypeName {
        HOUSE_TYPE_ONE(1,"新房"),HOUSE_TYPE_TWO(2,"旧房"),HOUSE_TYPE_THREE(3,"局部"),HOUSE_TYPE_FOUR(4,"软装");

        private Integer value;
        private String desc;

        HouseTypeName(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public Integer getValue() {
            return this.value;
        }

        public String getDesc() {
            return desc;
        }

        public static String getDescByVal(Integer value){
            for ( HouseTypeName houseTypeName : HouseTypeName.values()) {
                if (houseTypeName.getValue().equals(value)){
                    return houseTypeName.getDesc();
                }
            }
            return "";
        }
    }
    /***
     * 装修房屋的infoName
     * 11 一室一厅/21 二室一厅/31 三室一厅/32 三室二厅/41 四室一厅/42 四室二厅/101 越层/100 别墅
     * 0 客厅/1 主卧/2 次卧/3 书房/4 餐厅/5 厨房/6 卫生间/7 阳台
     */
    public enum HouseInfoName {
        HOUSE_INFO_ZERO(0,"客厅"),HOUSE_INFO_ONE(1,"主卧"),HOUSE_INFO_TWO(2,"次卧"),HOUSE_INFO_THREE(3,"书房"),HOUSE_INFO_FOUR(4,"餐厅"),
        HOUSE_INFO_FIVE(5,"厨房"),HOUSE_INFO_SIX(6,"卫生间"),HOUSE_INFO_SEVEN(7,"阳台"),
        HOUSE_INFO_Eleven(11,"一室一厅"),HOUSE_INFO_TWENTY_ONE(21,"二室一厅"), HOUSE_INFO_THIRTY_ONE(31,"三室一厅"),HOUSE_INFO_THIRTY_TWO(32,"三室二厅"),
        HOUSE_INFO_FORTY_ONE(41,"四室一厅"),HOUSE_INFO_FORTY_TWO(42,"四室二厅"),HOUSE_INFO_ONE_HUNDRED(100,"别墅"),HOUSE_INFO__ONE_HUNDRED_ONE(101,"越层");
        private Integer value;
        private String desc;

        HouseInfoName(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public static String getDescByVal(Integer value){
            for ( HouseInfoName houseInfoName : HouseInfoName.values()) {
                if (houseInfoName.getValue().equals(value)){
                    return houseInfoName.getDesc();
                }
            }
            return "";
        }

        public Integer getValue() {
            return this.value;
        }

        public String getDesc() {
            return desc;
        }
    }
}
