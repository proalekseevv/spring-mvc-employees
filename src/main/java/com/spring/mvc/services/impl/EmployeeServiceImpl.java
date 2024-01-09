package com.spring.mvc.services.impl;

import com.spring.mvc.dao.EmployeeDAO;
import com.spring.mvc.entities.Employee;
import com.spring.mvc.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }

    @Override
    @Transactional
    public Employee getById(int id) {
        return employeeDAO.getById(id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Employee employee) {
        employeeDAO.saveOrUpdate(employee);
    }

    @Override
    @Transactional
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}
