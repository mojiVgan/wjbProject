package com.job.demo.entity;

import lombok.*;

/**
 * Author: job
 * Date: 2020/5/11 17:24
 * Description:
 */
//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Animal {

    String name;
    double score;

    public Animal(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
