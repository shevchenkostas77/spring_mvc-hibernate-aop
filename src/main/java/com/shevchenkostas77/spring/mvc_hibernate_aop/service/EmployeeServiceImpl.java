package com.shevchenkostas77.spring.mvc_hibernate_aop.service;

import com.shevchenkostas77.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.shevchenkostas77.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional // спринг автоматически управляет открытием и закрытием транзакций
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }
}
