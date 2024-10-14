package org.example.Pages;

import lombok.extern.slf4j.Slf4j;
import org.example.Interfacies.IPerformanceReviewService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages the performance reviews of employees in the organization.
 * This class implements the IPerformanceReviewService interface to
 * provide functionality for adding and retrieving employee performance reviews.
 */
@Slf4j
public class PerformanceReviewManager implements IPerformanceReviewService {

    private Map<Integer, List<String>> reviews = new HashMap<>(); // Map to store performance reviews for employees

    /**
     * Adds a performance review for a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @param review the performance review text to be added
     */
    @Override
    public void addReview(int employeeId, String review) {
        reviews.computeIfAbsent(employeeId, k -> new ArrayList<>()).add(review);
    }

    /**
     * Retrieves all performance reviews for a specific employee.
     *
     * @param employeeId the unique identifier of the employee
     * @return a list of performance reviews for the employee, or an empty list if none are found
     */
    @Override
    public List<String> getReview(int employeeId) {
        return reviews.getOrDefault(employeeId, new ArrayList<>());
    }
}
