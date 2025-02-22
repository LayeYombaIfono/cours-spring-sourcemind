package com.sourcemind.employeesmgt.api;

import com.sourcemind.employeesmgt.dto.DepartmentDto;
import com.sourcemind.employeesmgt.service.DepartmentService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/departments")
public class DepartmentRestApiController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartement(@RequestBody DepartmentDto departmentDto){

        DepartmentDto departmentDtoSaved = departmentService.createDepartment(departmentDto);

        return new ResponseEntity<>(
                departmentDtoSaved, HttpStatus.CREATED
        );
    }

    @GetMapping
   public ResponseEntity<List<DepartmentDto>>listDepartment(){
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }
}
