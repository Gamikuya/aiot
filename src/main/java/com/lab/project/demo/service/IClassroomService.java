package com.lab.project.demo.service;

import com.lab.framework.web.domain.AjaxResult;
import com.lab.project.demo.domain.ClassroomEntity;

import java.util.List;

/**
 * @author Mikuya
 */
public interface IClassroomService {
    /**
     * 新增教室
     * @param classroomEntity
     * @return 新增行数
     */
    Integer addClassroom(ClassroomEntity classroomEntity);

    /**
     * 查询教室列表
     * @param classroomName
     * @return 教室列表集合
     */
    List<ClassroomEntity> listClassroom(String classroomName);

    /**
     * 查询教室详情（回显）
     * @param id
     * @return 返回教室详情
     */
    ClassroomEntity getClassroomInfoById(Long id);

    /**
     * 修改教室信息
     * @param classroomEntity
     * @return 返回操作结果
     */
    AjaxResult editClassroomInfo(ClassroomEntity classroomEntity);
}
