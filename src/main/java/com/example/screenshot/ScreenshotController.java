package com.example.screenshot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/screenshots")
public class ScreenshotController {
    private final ScreenshotService screenshotService;

    @Autowired
    public ScreenshotController(ScreenshotService screenshotService) {
        this.screenshotService = screenshotService;
    }

    @GetMapping
    public List<Screenshot> getAllScreenshots() {
        return screenshotService.getAllScreenshots();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Screenshot> getScreenshotById(@PathVariable String id) {
        return screenshotService.getScreenshotById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Screenshot createScreenshot(@RequestBody Screenshot screenshot) {
        return screenshotService.createScreenshot(screenshot);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Screenshot> updateScreenshot(@PathVariable String id, @RequestBody Screenshot updated) {
        return screenshotService.updateScreenshot(id, updated)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScreenshot(@PathVariable String id) {
        screenshotService.deleteScreenshot(id);
        return ResponseEntity.noContent().build();
    }
}
