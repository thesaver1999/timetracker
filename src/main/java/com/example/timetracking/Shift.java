package com.example.timetracking;

import jakarta.persistence.*;

@Entity
@Table(name = "shifts")
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String employeeId;
    private String teamId;
    private String organizationId;
    private String type; // manual, automated, scheduled, leave
    private Long start;
    private Long endTime; // renamed from 'end' to avoid SQL keyword conflict
    private String timezone;
    private Long duration;
    private String projectId;
    private String taskId;
    private String computer;
    private Boolean paid;
    private Double payRate;
    private Double overtimePayRate;
    private Long overtimeStart;
    private Long createdAt;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public String getTeamId() { return teamId; }
    public void setTeamId(String teamId) { this.teamId = teamId; }
    public String getOrganizationId() { return organizationId; }
    public void setOrganizationId(String organizationId) { this.organizationId = organizationId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public Long getStart() { return start; }
    public void setStart(Long start) { this.start = start; }
    public Long getEndTime() { return endTime; }
    public void setEndTime(Long endTime) { this.endTime = endTime; }
    public String getTimezone() { return timezone; }
    public void setTimezone(String timezone) { this.timezone = timezone; }
    public Long getDuration() { return duration; }
    public void setDuration(Long duration) { this.duration = duration; }
    public String getProjectId() { return projectId; }
    public void setProjectId(String projectId) { this.projectId = projectId; }
    public String getTaskId() { return taskId; }
    public void setTaskId(String taskId) { this.taskId = taskId; }
    public String getComputer() { return computer; }
    public void setComputer(String computer) { this.computer = computer; }
    public Boolean getPaid() { return paid; }
    public void setPaid(Boolean paid) { this.paid = paid; }
    public Double getPayRate() { return payRate; }
    public void setPayRate(Double payRate) { this.payRate = payRate; }
    public Double getOvertimePayRate() { return overtimePayRate; }
    public void setOvertimePayRate(Double overtimePayRate) { this.overtimePayRate = overtimePayRate; }
    public Long getOvertimeStart() { return overtimeStart; }
    public void setOvertimeStart(Long overtimeStart) { this.overtimeStart = overtimeStart; }
    public Long getCreatedAt() { return createdAt; }
    public void setCreatedAt(Long createdAt) { this.createdAt = createdAt; }
}
