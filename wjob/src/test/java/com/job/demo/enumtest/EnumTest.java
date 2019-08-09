package com.job.demo.enumtest;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * Author: job
 * Date: 2019/7/2 16:59
 */
public class EnumTest {

    public static void main(String[] args) {
        BigDecimal desc = DesignerScore.getDesc("3");
        System.out.println(desc);

        BigDecimal resDecimal = new BigDecimal(0);

        for (int i = 0; i < 10; i++) {
            BigDecimal scoreLevelDecimal = new BigDecimal(50);
            BigDecimal newDecimal = BigDecimal.ZERO;
            BigDecimal proportionNum = new BigDecimal(7);
            System.out.println(proportionNum);
            proportionNum = proportionNum.divide(BigDecimal.TEN.multiply(BigDecimal.TEN));
            newDecimal = scoreLevelDecimal.multiply(proportionNum);//乘以权重
            resDecimal = resDecimal.add(newDecimal) ;
            System.out.println(proportionNum);
        }
    }

    /**
     * Created by wangjiangbo on 2019/7/5
     * 通过枚举来显示对应阶段的值
     */
    public enum DesignerScore {


        SCORE_ONE("0", new BigDecimal(100)),
        SCORE_TWO("1",new BigDecimal(100)),
        SCORE_THREE("2",new BigDecimal(100));

        private String scoreStage;
        private BigDecimal scoreDesc;

        public static BigDecimal getDesc(String scoreStage){
           if (StringUtils.isEmpty(scoreStage)){
                return new BigDecimal(0);
            }
            for(DesignerScore ds : DesignerScore.values()){
                if (ds.scoreStage.equals(scoreStage)){
                    return ds.getScoreDesc();
                }
            }
            return  new BigDecimal(0);
        }

        private DesignerScore(String scoreStage, BigDecimal scoreDesc) {
            this.scoreStage = scoreStage;
            this.scoreDesc = scoreDesc;
        }

        public String getScoreStage() {
            return scoreStage;
        }

        public void setScoreStage(String scoreStage) {
            this.scoreStage = scoreStage;
        }

        public BigDecimal getScoreDesc() {
            return scoreDesc;
        }

        public void setScoreDesc(BigDecimal scoreDesc) {
            this.scoreDesc = scoreDesc;
        }
    }
}
