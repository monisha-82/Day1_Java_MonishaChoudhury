package data;

import core.Employee;
import logging.LoggerConfig;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private static final Logger logger = LoggerConfig.getLogger(EmployeeRepository.class);
    private List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        logger.info("Added employee: {}", employee);
    }
    public Employee getEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == id) {
                logger.info("Retrieved employee by ID {}: {}", id, emp);
                return emp;
            }
        }
        logger.warn("Employee with ID {} not found", id);
        return null;
    }

    public Employee getEmployeeByName(String name) {
        for (Employee emp : employees) {
            if (emp.getEmpName().equalsIgnoreCase(name)) {
                logger.info("Retrieved employee by name {}: {}", name, emp);
                return emp;
            }
        }
        logger.warn("Employee with name {} not found", name);
        return null;
    }


    public void updateEmployee(int id, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpId() == id) {
                employees.set(i, updatedEmployee);
                logger.info("Updated employee with ID {}: {}", id, updatedEmployee);
                return;
            }
        }
        logger.warn("Employee with ID {} not found for update", id);
    }

}
