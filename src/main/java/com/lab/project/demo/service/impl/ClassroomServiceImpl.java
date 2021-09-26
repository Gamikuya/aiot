package com.lab.project.demo.service.impl;

import com.lab.common.utils.ParameterUtil;
import com.lab.framework.web.domain.AjaxResult;
import com.lab.project.demo.domain.ClassroomEntity;
import com.lab.project.demo.mapper.ClassroomMapper;
import com.lab.project.demo.service.IClassroomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<ClassroomEntity> listClassroom(String classroomName) {
        return classroomMapper.listClassroom(classroomName);
    }

    @Override
    public ClassroomEntity getClassroomInfoById(Long id) {
        return classroomMapper.getClassroomInfoById(id);
    }

    @Override
    public AjaxResult editClassroomInfo(ClassroomEntity classroomEntity) {
        // 设置修改基础属性
        ParameterUtil.setUpdateEntity(classroomEntity);
        return classroomMapper.editClassroomInfo(classroomEntity) > 0 ? AjaxResult.success():AjaxResult.error("触发乐观锁，修改失败");
    }
}
