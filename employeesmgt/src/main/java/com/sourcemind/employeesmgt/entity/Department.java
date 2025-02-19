package com.sourcemind.employeesmgt.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_department")
    private Long idDepartment;

    @Column(name = "code", unique = true, nullable = false)
    private String code;

    @Column(name = "label")
    private String label;

    @OneToMany(mappedBy = "department", cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    private List<Employee> employees = new ArrayList<>();

}
