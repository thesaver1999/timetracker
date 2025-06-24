package com.example.timetracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shifts")
public class ShiftController {
    private final ShiftService shiftService;

    @Autowired
    public ShiftController(ShiftService shiftService) {
        this.shiftService = shiftService;
    }

    @GetMapping
    public List<Shift> getAllShifts() {
        return shiftService.getAllShifts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shift> getShiftById(@PathVariable String id) {
        return shiftService.getShiftById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Shift createShift(@RequestBody Shift shift) {
        return shiftService.createShift(shift);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shift> updateShift(@PathVariable String id, @RequestBody Shift updated) {
        return shiftService.updateShift(id, updated)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShift(@PathVariable String id) {
        shiftService.deleteShift(id);
        return ResponseEntity.noContent().build();
    }
}
