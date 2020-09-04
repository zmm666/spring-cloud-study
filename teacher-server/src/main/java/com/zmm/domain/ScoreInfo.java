package com.zmm.domain;

import javax.persistence.Table;

@Table(name = "score")
public class ScoreInfo extends ScoreInfoKey {
    private Integer sScore;

    public Integer getsScore() {
        return sScore;
    }

    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }
}