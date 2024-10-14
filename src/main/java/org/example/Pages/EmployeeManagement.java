package org.example.Pages;

import lombok.extern.slf4j.Slf4j;
import org.example.Interfacies.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for managing employee records,
 * including adding, removing, and retrieving employee information.
 * It also manages employee salary updates and performance reviews.
 */
@Slf4j
public class EmployeeManagement implements IEmployeeRepository {
    private List<Employee> employees;       // List to store employee records
    private SalaryManager salaryManager;     // Manages salary-related operations
    private PerformanceReviewManager reviewManager; // Manages performance reviews

    /**
     * Constructor to initialize the EmployeeManagement system.
     */
    public EmployeeManagement() {
        this.employees = new ArrayList<>(); // Initialize the employee list
        this.salaryManager = new SalaryManager(); // Initialize the salary manager
        this.reviewManager = new PerformanceReviewManager(); // Initialize the review manager
    }

    /**
     * Adds a new employee to the system.
     *
     * @param employee the Employee object to be added
     */
    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        log.info("Employee added: {}", employee);
    }

    /**
     * Removes an employee from the system based on their ID.
     *
     * @param employeeId the ID of the employee to be removed
     */
    @Override
    public void removeEmployee(int employeeId) {
        Employee employeeToRemove = getEmployeeById(employeeId);
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            log.info("Employee removed: {}", employeeToRemove);
        } else {
            log.warn("Employee with ID {} not found", employeeId);
        }
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param employeeId the ID of the employee to be retrieved
     * @return the Employee object if found, null otherwise
     */
    @Override
    public Employee getEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Updates the salary of an employee.
     *
     * @param employeeId the ID of the employee whose salary will be updated
     * @param newSalary the new salary amount
     //כפל קוד!!!
    public void updateEmployeeSalary(int employeeId, double newSalary) {
        salaryManager.updateSalary(employeeId, newSalary);
        log.info("Updated salary for employee ID {} to {}", employeeId, newSalary);
    }
*/
    /**
     * Reviews an employee's performance.
     *
     * @param employeeId the ID of the employee to be reviewed
     * @param review the performance review text
     */
    public void reviewEmployeePerformance(int employeeId, String review) {
        reviewManager.addReview(employeeId, review);
        log.info("Added performance review for employee ID {}: {}", employeeId, review);
    }
}

