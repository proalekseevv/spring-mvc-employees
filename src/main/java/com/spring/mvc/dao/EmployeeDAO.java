package com.spring.mvc.dao;

import com.spring.mvc.entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAll();

    Employee getById(int id);

    void saveOrUpdate(Employee employee);

    void delete(int id);
}
