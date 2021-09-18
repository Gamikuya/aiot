package com.lab.project.demo.service;

import com.lab.project.demo.domain.ClassroomEntity;

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
}
