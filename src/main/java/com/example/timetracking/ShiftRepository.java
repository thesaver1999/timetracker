package com.example.timetracking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift, String> {
    // Custom query methods if needed
}
