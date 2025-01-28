package app;

import core.Employee;
import data.EmployeeRepository;
import logging.LoggerConfig;
import org.slf4j.Logger;

public class Main {
    private static final Logger logger = LoggerConfig.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Application started.");
        EmployeeRepository empRepository = new EmployeeRepository();

        // Adding employees
        Employee emp1 = new Employee(1111, "Tokyo", 22, "Tech");
        Employee emp2 = new Employee(2222, "Berlin", 40, "HR");
        empRepository.addEmployee(emp1);
        empRepository.addEmployee(emp2);

        // Retrieving employees
        Employee retrievedEmp = empRepository.getEmployeeById(1111);
        if (retrievedEmp != null) {
            System.out.println("Retrieved Employee: " + retrievedEmp);
        }

        // Update an employee
        Employee updatedEmp = new Employee(1222, "Nairobi", 29, "Finance");
        empRepository.updateEmployee(1111, updatedEmp);

        // Retrieve non-existing employee
        empRepository.getEmployeeById(9999);

        logger.info("Application ended.");
    }
}
