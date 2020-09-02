package com.zmm.service.impl;

import com.zmm.domain.TeacherInfo;
import com.zmm.mapper.TeacherInfoMapper;
import com.zmm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherInfoMapper teacherMapper;

    public List<TeacherInfo> searchTeacher() {
        return teacherMapper.selectAll();
    }
}
