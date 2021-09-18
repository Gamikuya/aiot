package com.lab.project.demo.controller;

import com.lab.framework.web.domain.AjaxResult;

import com.lab.project.demo.domain.ClassroomEntity;
import com.lab.project.demo.service.IClassroomService;
import com.lab.project.demo.service.impl.ClassroomServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Mikuya
 */
@RestController
@RequestMapping("/demo/classroom")
@Slf4j
@AllArgsConstructor
public class ClassroomController {

    private IClassroomService classroomService ;


    @PostMapping("/add")
    public AjaxResult addClassroom(@RequestBody ClassroomEntity classroomEntity){
        classroomService.addClassroom(classroomEntity);
        log.error("===classroomEntity==={}",classroomEntity);
        return AjaxResult.success();
    }
}
