package com.sourcemind.employeesmgt.service;

import com.sourcemind.employeesmgt.dto.DepartmentDto;
import com.sourcemind.employeesmgt.entity.Department;
import com.sourcemind.employeesmgt.mapper.DepartmentMapper;
import com.sourcemind.employeesmgt.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {

//        if (departmentDto.getCode() == null){
//            System.out.println("Le code du departement ne doit pas être null");
//        }

        // Convert dto to entity
        Department department = departmentMapper.toEntity(departmentDto);
        Department departmentSaved = departmentRepository.save(department);

        return departmentMapper.toDto(departmentSaved);



    }

    @Override
    public DepartmentDto getAllDepartments() {

//        Department department = departmentMapper.toEntity(departmentDto);
        List <Department> departmentGetAlls = departmentRepository.findAll();
        return departmentMapper.toDto((Department) departmentGetAlls);
    }
}
