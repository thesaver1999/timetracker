package com.example.employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    // Custom query methods if needed
    Employee findByIdentifierAndPassword(String identifier, String password);
}
