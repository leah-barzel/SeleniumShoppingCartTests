package org.example.Pages;

import lombok.extern.slf4j.Slf4j;
import org.example.Interfacies.ISalaryService;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages the salary information of employees in the organization.
 * This class implements the ISalaryService interface to provide
 * functionality for updating and retrieving employee salaries.
 */
@Slf4j
public class SalaryManager implements ISalaryService {

    private Map<Integer, Double> salaries = new HashMap<>(); // Map to store employee salaries

    /**
     * Updates the salary for a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @param newSalary the new salary amount to be set
     */
    @Override
    public void updateSalary(int employeeId, double newSalary) {
        salaries.put(employeeId, newSalary);
    }

    /**
     * Retrieves the salary of a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @return the salary of the employee, or 0.0 if no salary is found
     */
    @Override
    public double getSalary(int employeeId) {
        return salaries.getOrDefault(employeeId, 0.0);
    }
}
