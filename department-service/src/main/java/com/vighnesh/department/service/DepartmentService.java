package com.vighnesh.department.service;

import com.vighnesh.department.entity.Department;
import com.vighnesh.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("In saveDepartment inside Department Service");
        return departmentRepository.save(department);
    }

    public Department getByDepartmentId(Long departmentId) {
        log.info("In getDepartmentById inside Department Service");
        return departmentRepository.getByDepartmentId(departmentId);
    }
}
