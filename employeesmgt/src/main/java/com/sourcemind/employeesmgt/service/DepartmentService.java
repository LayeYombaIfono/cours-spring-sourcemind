package com.sourcemind.employeesmgt.service;

import com.sourcemind.employeesmgt.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getAllDepartments();

}
