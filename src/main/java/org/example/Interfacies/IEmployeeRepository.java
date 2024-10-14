package org.example.Interfacies;

import org.example.Pages.Employee;

/**
 * This interface defines the operations for managing employee records
 * in an employee management system. It serves as a contract for any
 * implementation of employee repository management.
 */
public interface IEmployeeRepository {

    /**
     * Adds a new employee to the repository.
     *
     * @param employee the Employee object to be added
     */
    void addEmployee(Employee employee);

    /**
     * Removes an employee from the repository based on their ID.
     *
     * @param employeeId the ID of the employee to be removed
     */
    void removeEmployee(int employeeId);

    /**
     * Retrieves an employee from the repository by their ID.
     *
     * @param employeeId the ID of the employee to be retrieved
     * @return the Employee object if found, null otherwise
     */
    Employee getEmployeeById(int employeeId);
}
