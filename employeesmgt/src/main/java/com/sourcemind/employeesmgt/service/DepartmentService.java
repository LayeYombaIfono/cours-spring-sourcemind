package com.sourcemind.employeesmgt.service;

import com.sourcemind.employeesmgt.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {

    DepartmentDto createDepartment(DepartmentDto departmentDto);

   List<DepartmentDto>  getAllDepartments();

}
