package com.example.task;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String status;
    private String priority;
    private boolean billable;
    private String name;
    private String projectId;
    @ElementCollection
    private List<String> employees;
    private String description;
    private String creatorId;
    private String organizationId;
    @ElementCollection
    private List<String> teams;
    private Long createdAt;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public boolean isBillable() { return billable; }
    public void setBillable(boolean billable) { this.billable = billable; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getProjectId() { return projectId; }
    public void setProjectId(String projectId) { this.projectId = projectId; }
    public List<String> getEmployees() { return employees; }
    public void setEmployees(List<String> employees) { this.employees = employees; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getCreatorId() { return creatorId; }
    public void setCreatorId(String creatorId) { this.creatorId = creatorId; }
    public String getOrganizationId() { return organizationId; }
    public void setOrganizationId(String organizationId) { this.organizationId = organizationId; }
    public List<String> getTeams() { return teams; }
    public void setTeams(List<String> teams) { this.teams = teams; }
    public Long getCreatedAt() { return createdAt; }
    public void setCreatedAt(Long createdAt) { this.createdAt = createdAt; }
}
