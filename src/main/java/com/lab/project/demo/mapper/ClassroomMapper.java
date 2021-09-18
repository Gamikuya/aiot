package com.lab.project.demo.mapper;

import com.lab.project.demo.domain.ClassroomEntity;

/**
 * @author Mikuya
 */
public interface ClassroomMapper {
    /**
     * 新增教室
     * @param classroomEntity
     * @return 受影响行数
     */
    Integer addClassroom(ClassroomEntity classroomEntity);
}
