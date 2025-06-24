package com.example.project;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private boolean archived;
    @ElementCollection
    private List<String> statuses;
    @ElementCollection
    private List<String> priorities;
    private boolean billable;
    private String name;
    private String description;
    @ElementCollection
    private List<String> employees;
    private String creatorId;
    private String organizationId;
    @ElementCollection
    private List<String> teams;
    private Long createdAt;
    // TODO: Add payroll and screenshotSettings as separate entities if needed

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public boolean isArchived() { return archived; }
    public void setArchived(boolean archived) { this.archived = archived; }
    public List<String> getStatuses() { return statuses; }
    public void setStatuses(List<String> statuses) { this.statuses = statuses; }
    public List<String> getPriorities() { return priorities; }
    public void setPriorities(List<String> priorities) { this.priorities = priorities; }
    public boolean isBillable() { return billable; }
    public void setBillable(boolean billable) { this.billable = billable; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public List<String> getEmployees() { return employees; }
    public void setEmployees(List<String> employees) { this.employees = employees; }
    public String getCreatorId() { return creatorId; }
    public void setCreatorId(String creatorId) { this.creatorId = creatorId; }
    public String getOrganizationId() { return organizationId; }
    public void setOrganizationId(String organizationId) { this.organizationId = organizationId; }
    public List<String> getTeams() { return teams; }
    public void setTeams(List<String> teams) { this.teams = teams; }
    public Long getCreatedAt() { return createdAt; }
    public void setCreatedAt(Long createdAt) { this.createdAt = createdAt; }
}
