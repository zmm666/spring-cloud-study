package com.zmm.mapper;

import com.zmm.domain.CourseInfo;

public interface CourseInfoMapper {
    int deleteByPrimaryKey(String cId);

    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    CourseInfo selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(CourseInfo record);

    int updateByPrimaryKey(CourseInfo record);
}