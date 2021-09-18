package com.lab.project.demo.service.impl;

import com.lab.common.utils.ParameterUtil;
import com.lab.project.demo.domain.ClassroomEntity;
import com.lab.project.demo.mapper.ClassroomMapper;
import com.lab.project.demo.service.IClassroomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Mikuya
 */
@Service
@Slf4j
@AllArgsConstructor
public class ClassroomServiceImpl implements IClassroomService {

    private ClassroomMapper classroomMapper;
    @Override
    public Integer addClassroom(ClassroomEntity classroomEntity) {
        //填充基本属性
        ParameterUtil.setCreateEntity(classroomEntity);
        //新增教室，并返回受影响行数
        return classroomMapper.addClassroom(classroomEntity);



    }
}
