package com.spring.mvc.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank(message = "Field name is required")
    @Size(max = 40, message = "Field name must been less than 40 symbols")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "Field surname is required")
    @Size(max = 40, message = "Field surname must been less than 40 symbols")
    private String surname;

    @Column(name = "salary")
    @Min(value = 500, message = "Field salary must been greater than 500$")
    @Max(value = 15000, message = "Field salary must been less than 15.000$")
    private int salary;

    @Column(name = "age")
    @Min(value = 14, message = "Field age must been greater than 14 years")
    @Max(value = 65, message = "Field age must been less than 60 years")
    private int age;

    @Column(name = "department")
    @NotBlank(message = "Field department is required")
    @Size(max = 40, message = "Field department must been less than 40 symbols")
    private String department;

    public Employee(String name, String surname, int salary, int age, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }
}
