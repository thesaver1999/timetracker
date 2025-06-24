package com.example.screenshot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreenshotRepository extends JpaRepository<Screenshot, String> {
    // Custom query methods if needed
}
