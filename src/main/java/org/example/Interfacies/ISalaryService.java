package org.example.Interfacies;

/**
 * This interface defines the operations for managing employee salaries
 * in an organization. It provides methods for updating and retrieving
 * salaries associated with employees.
 */
public interface ISalaryService {

    /**
     * Updates the salary for a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @param newSalary the new salary amount to be set for the employee
     */
    void updateSalary(int employeeId, double newSalary);

    /**
     * Retrieves the salary of a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @return the current salary of the employee, or 0.0 if no salary is found
     */
    double getSalary(int employeeId);
}
