package com.example.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {
    // Custom query methods if needed
}
