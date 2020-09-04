package com.zmm.service.impl;

import com.zmm.client.StudentClient;
import com.zmm.domain.TeacherInfo;
import com.zmm.mapper.TeacherInfoMapper;
import com.zmm.pojo.StudentResultVo;
import com.zmm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherInfoMapper teacherMapper;
    @Autowired
    private StudentClient studentClient;

    public List<TeacherInfo> searchTeacher() {
        List<StudentResultVo> vos = studentClient.search();
        System.err.println("===============> vos: " + vos.size());
        return teacherMapper.selectAll();
    }
}
