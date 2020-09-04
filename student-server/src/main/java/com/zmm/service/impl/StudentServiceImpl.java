package com.zmm.service.impl;

import com.zmm.domain.StudentInfo;
import com.zmm.mapper.StudentInfoMapper;
import com.zmm.pojo.StudentResultVo;
import com.zmm.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public List<StudentResultVo> search() {
        List<StudentResultVo> stuVos = new ArrayList<StudentResultVo>();
        List<StudentInfo> studentInfos = studentInfoMapper.selectAll();
        if (!CollectionUtils.isEmpty(studentInfos)){
            studentInfos.forEach(item -> {
                StudentResultVo vo = new StudentResultVo();
                BeanUtils.copyProperties(item,vo);
                stuVos.add(vo);
            });
        }
        return stuVos;
    }
}
