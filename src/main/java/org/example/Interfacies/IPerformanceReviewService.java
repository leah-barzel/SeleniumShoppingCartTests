package org.example.Interfacies;

import java.util.List;

/**
 * This interface defines the operations for managing performance reviews
 * for employees in an organization. It provides methods for adding
 * reviews and retrieving them.
 */
public interface IPerformanceReviewService {

    /**
     * Adds a performance review for a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @param review the performance review text to be added
     */
    void addReview(int employeeId, String review);

    /**
     * Retrieves all performance reviews for a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @return a list of performance reviews for the employee
     */
    List<String> getReview(int employeeId);
}
