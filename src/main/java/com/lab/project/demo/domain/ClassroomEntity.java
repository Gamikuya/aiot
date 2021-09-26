package com.lab.project.demo.domain;

import com.lab.framework.web.domain.BaseEntity;

import lombok.Data;
import lombok.ToString;

/**
 * @author Mikuya
 */
@Data
@ToString
public class ClassroomEntity extends BaseEntity {
    /**
     * 序列化id
     */
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 教室名称
     */
    private String classroomName;
    /**
     * 内容
     */
    private String content;
    /**
     * 教室可容纳人数
     */
    private Integer classroomNum;
}
