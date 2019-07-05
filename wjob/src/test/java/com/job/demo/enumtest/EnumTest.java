package com.job.demo.enumtest;

import org.apache.commons.lang3.StringUtils;

/**
 * Author: job
 * Date: 2019/7/2 16:59
 */
public class EnumTest {

    public static void main(String[] args) {
        String desc = DesignerScore.getDesc("3");
        System.out.println(desc);
    }

    /**
     * Created by wangjiangbo on 2019/7/5
     * 通过枚举来显示对应阶段的值
     */
    public enum DesignerScore {

    //    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN();

        SCORE_ONE("0","150"),
        SCORE_TWO("1","50"),
        SCORE_THREE("2","0"),
        SCORE_FOUR("3","-200"),
        SCORE_FIVE("4","-500");

        private String scoreStage;
        private String scoreDesc;

        public static String getDesc(String scoreStage){
           if (StringUtils.isEmpty(scoreStage)){
                return "";
            }
            for(DesignerScore ds : DesignerScore.values()){
                if (ds.scoreStage.equals(scoreStage)){
                    return ds.getScoreDesc();
                }
            }
            return "";
        }

        private DesignerScore(String scoreStage, String scoreDesc) {
            this.scoreStage = scoreStage;
            this.scoreDesc = scoreDesc;
        }

        public String getScoreStage() {
            return scoreStage;
        }

        public void setScoreStage(String scoreStage) {
            this.scoreStage = scoreStage;
        }

        public String getScoreDesc() {
            return scoreDesc;
        }

        public void setScoreDesc(String scoreDesc) {
            this.scoreDesc = scoreDesc;
        }
    }
}
