package com.vighnesh.department.controller;

import com.vighnesh.department.entity.Department;
import com.vighnesh.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("In saveDepartment inside Department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getByDepartmentId(@PathVariable("id") Long departmentId){
        log.info("In getDepartmentById inside Department controller");
        return departmentService.getByDepartmentId(departmentId);
    }
}
