package com.zmm.mapper;

import com.zmm.domain.StudentInfo;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(String sId);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(String sId);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}