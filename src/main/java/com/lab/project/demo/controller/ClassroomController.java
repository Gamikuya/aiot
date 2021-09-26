package com.lab.project.demo.controller;

import com.lab.framework.web.controller.BaseController;
import com.lab.framework.web.domain.AjaxResult;

import com.lab.framework.web.page.TableDataInfo;
import com.lab.project.demo.domain.ClassroomEntity;
import com.lab.project.demo.service.IClassroomService;
import com.lab.project.demo.service.impl.ClassroomServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Mikuya
 */
@RestController
@RequestMapping("/demo/classroom")
@Slf4j
@AllArgsConstructor
public class ClassroomController extends BaseController {

    private IClassroomService classroomService ;


    @PostMapping("/add")
    public AjaxResult addClassroom(@RequestBody ClassroomEntity classroomEntity){
        return toAjax(classroomService.addClassroom(classroomEntity));
    }

    @GetMapping("/list")
    public TableDataInfo listClassroom(String classroomName){
        startPage();
        return getDataTable(classroomService.listClassroom(classroomName));
    }

    @GetMapping("/getInfo/{id}")
    public AjaxResult getClassroomInfoById(@PathVariable("id") Long id){
        return AjaxResult.success(classroomService.getClassroomInfoById(id));
    }

    @PutMapping("/edit")
    public AjaxResult editClassroomInfo(@RequestBody ClassroomEntity classroomEntity){

        return  classroomService.editClassroomInfo(classroomEntity);
    }
}
