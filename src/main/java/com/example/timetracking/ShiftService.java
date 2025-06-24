package com.example.timetracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShiftService {
    private final ShiftRepository shiftRepository;

    @Autowired
    public ShiftService(ShiftRepository shiftRepository) {
        this.shiftRepository = shiftRepository;
    }

    public List<Shift> getAllShifts() {
        return shiftRepository.findAll();
    }

    public Optional<Shift> getShiftById(String id) {
        return shiftRepository.findById(id);
    }

    public Shift createShift(Shift shift) {
        shift.setCreatedAt(System.currentTimeMillis());
        return shiftRepository.save(shift);
    }

    public Optional<Shift> updateShift(String id, Shift updated) {
        return shiftRepository.findById(id).map(existing -> {
            existing.setEmployeeId(updated.getEmployeeId());
            existing.setTeamId(updated.getTeamId());
            existing.setOrganizationId(updated.getOrganizationId());
            existing.setType(updated.getType());
            existing.setStart(updated.getStart());
            existing.setEndTime(updated.getEndTime());
            existing.setTimezone(updated.getTimezone());
            existing.setDuration(updated.getDuration());
            existing.setProjectId(updated.getProjectId());
            existing.setTaskId(updated.getTaskId());
            existing.setComputer(updated.getComputer());
            existing.setPaid(updated.getPaid());
            existing.setPayRate(updated.getPayRate());
            existing.setOvertimePayRate(updated.getOvertimePayRate());
            existing.setOvertimeStart(updated.getOvertimeStart());
            // ... add other fields as needed
            return shiftRepository.save(existing);
        });
    }

    public void deleteShift(String id) {
        shiftRepository.deleteById(id);
    }
}
