package com.job.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Author: wangjiangbo
 * Date: 2020/11/10 13:05
 * Description:
 */
@Setter
@Getter
public class Score {

    private String name;
    private BigDecimal scoreNum;

    public Score(String name, BigDecimal scoreNum) {
        this.name = name;
        this.scoreNum = scoreNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(BigDecimal scoreNum) {
        this.scoreNum = scoreNum;
    }
}
