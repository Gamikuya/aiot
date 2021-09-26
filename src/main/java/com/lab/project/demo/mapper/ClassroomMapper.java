package com.lab.project.demo.mapper;

import com.lab.project.demo.domain.ClassroomEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     *  查询教室信息
     * @param classroomName
     * @return 返回教室集合
     */
    List<ClassroomEntity> listClassroom(@Param(value = "classroom") String classroomName);

    /**
     * 查询教室详情（回显）
     * @param id
     * @return 返回教室详情
     */
    ClassroomEntity getClassroomInfoById(@Param(value = "id") Long id );

    /**
     * 修改教室信息
     * @param classroomEntity
     * @return 返回操作结果
     */
    Integer editClassroomInfo(ClassroomEntity classroomEntity);
}
