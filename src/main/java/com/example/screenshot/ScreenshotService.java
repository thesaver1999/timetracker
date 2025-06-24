package com.example.screenshot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScreenshotService {
    private final ScreenshotRepository screenshotRepository;

    @Autowired
    public ScreenshotService(ScreenshotRepository screenshotRepository) {
        this.screenshotRepository = screenshotRepository;
    }

    public List<Screenshot> getAllScreenshots() {
        return screenshotRepository.findAll();
    }

    public Optional<Screenshot> getScreenshotById(String id) {
        return screenshotRepository.findById(id);
    }

    public Screenshot createScreenshot(Screenshot screenshot) {
        return screenshotRepository.save(screenshot);
    }

    public Optional<Screenshot> updateScreenshot(String id, Screenshot updated) {
        return screenshotRepository.findById(id).map(existing -> {
            existing.setSite(updated.getSite());
            existing.setProductivity(updated.getProductivity());
            existing.setEmployeeId(updated.getEmployeeId());
            existing.setAppId(updated.getAppId());
            existing.setAppOrgId(updated.getAppOrgId());
            existing.setAppTeamId(updated.getAppTeamId());
            existing.setTeamId(updated.getTeamId());
            existing.setOrganizationId(updated.getOrganizationId());
            existing.setSrcEmployeeId(updated.getSrcEmployeeId());
            existing.setSrcTeamId(updated.getSrcTeamId());
            existing.setTimestampTranslated(updated.getTimestampTranslated());
            existing.setSystemPermissions(updated.getSystemPermissions());
            existing.setNext(updated.getNext());
            // ... add other fields as needed
            return screenshotRepository.save(existing);
        });
    }

    public void deleteScreenshot(String id) {
        screenshotRepository.deleteById(id);
    }
}
