package com.spring.mvc.services;

import com.spring.mvc.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee getById(int id);

    void saveOrUpdate(Employee employee);

    void delete(int id);
}
