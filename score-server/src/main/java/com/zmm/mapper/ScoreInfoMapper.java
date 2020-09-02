package com.zmm.mapper;

import com.zmm.domain.ScoreInfo;
import com.zmm.domain.ScoreInfoKey;

public interface ScoreInfoMapper {
    int deleteByPrimaryKey(ScoreInfoKey key);

    int insert(ScoreInfo record);

    int insertSelective(ScoreInfo record);

    ScoreInfo selectByPrimaryKey(ScoreInfoKey key);

    int updateByPrimaryKeySelective(ScoreInfo record);

    int updateByPrimaryKey(ScoreInfo record);
}