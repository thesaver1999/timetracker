package com.example.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {
    // Custom query methods if needed
}
