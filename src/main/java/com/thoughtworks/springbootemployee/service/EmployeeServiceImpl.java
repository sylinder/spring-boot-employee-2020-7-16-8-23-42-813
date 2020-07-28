package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
            }
            return ;
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        for (Employee innerEmployee : employees) {
            if (innerEmployee.getId() == employee.getId()) {
                employees.remove(innerEmployee);
                employees.add(employee);
                return ;
            }
        }
    }


}
