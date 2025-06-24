package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        employee.setCreatedAt(System.currentTimeMillis());
        return employeeRepository.save(employee);
    }

    public Optional<Employee> updateEmployee(String id, Employee updated) {
        return employeeRepository.findById(id).map(existing -> {
            existing.setName(updated.getName());
            existing.setTeamsId(updated.getTeamsId());
            existing.setSharedSettingsId(updated.getSharedSettingsId());
            existing.setAccountId(updated.getAccountId());
            existing.setIdentifier(updated.getIdentifier());
            existing.setType(updated.getType());
            existing.setOrganizationId(updated.getOrganizationId());
            existing.setProjects(updated.getProjects());
            existing.setDeactivated(updated.getDeactivated());
            existing.setInvited(updated.getInvited());
            existing.setPassword(updated.getPassword());
            // ... add other fields as needed
            return employeeRepository.save(existing);
        });
    }

    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }

    public Employee authenticate(String identifier, String password) {
        return employeeRepository.findByIdentifierAndPassword(identifier, password);
    }
}
