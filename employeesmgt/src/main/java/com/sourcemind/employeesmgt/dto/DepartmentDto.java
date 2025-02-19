package com.sourcemind.employeesmgt.dto;


import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
public class DepartmentDto {

    private Long idDepartment;

   @NotNull
    private String code;

    @NotNull
    private String label;
}
