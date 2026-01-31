package com.garments.erp.service;

import com.garments.erp.dao.EmployeeDAO;
import com.garments.erp.model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public boolean addEmployee(Employee emp) {
        if (emp.getSalary() <= 0) return false;
        return employeeDAO.addEmployee(emp);
    }

    public boolean updateEmployee(Employee emp) {
        if (emp.getSalary() <= 0) return false;
        return employeeDAO.updateEmployee(emp);
    }

    public boolean deleteEmployee(int empId) {
        return employeeDAO.deleteEmployee(empId);
    }

    public List<Employee> viewEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public List<Employee> searchEmployeeByName(String name) {
        return employeeDAO.searchEmployee(name);
    }
}
