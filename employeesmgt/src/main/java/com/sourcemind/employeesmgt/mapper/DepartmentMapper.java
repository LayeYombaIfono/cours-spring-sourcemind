package com.sourcemind.employeesmgt.mapper;

import com.sourcemind.employeesmgt.dto.DepartmentDto;
import com.sourcemind.employeesmgt.entity.Department;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {
    ModelMapper modelMapper = new ModelMapper();

    public Department toEntity(DepartmentDto departmentDto){

        return modelMapper.map(departmentDto, Department.class);
    }

    public  DepartmentDto toDto(Department department){
        return modelMapper.map(department, DepartmentDto.class);
    }
}
