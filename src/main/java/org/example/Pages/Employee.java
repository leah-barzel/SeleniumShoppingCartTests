package org.example.Pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents an employee in the organization.
 * This class holds the details of the employee,
 * including their ID, name, and department.
 */
@Getter
@Slf4j
@AllArgsConstructor
public class Employee {

    private int id;              // Unique identifier for the employee
    private String name;         // Employee's name
    private String department;    // Department where the employee works



}
