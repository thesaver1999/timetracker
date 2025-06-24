package com.example.employee;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String teamsId;
    private String sharedSettingsId;
    private String accountId;
    private String identifier;
    private String type; // personal, office
    private String organizationId;
    @ElementCollection
    private List<String> projects;
    private Long deactivated;
    private Long invited;
    private Long createdAt;
    private String password;

    // TODO: Add systemPermissions as a separate entity if needed

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTeamsId() { return teamsId; }
    public void setTeamsId(String teamsId) { this.teamsId = teamsId; }
    public String getSharedSettingsId() { return sharedSettingsId; }
    public void setSharedSettingsId(String sharedSettingsId) { this.sharedSettingsId = sharedSettingsId; }
    public String getAccountId() { return accountId; }
    public void setAccountId(String accountId) { this.accountId = accountId; }
    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getOrganizationId() { return organizationId; }
    public void setOrganizationId(String organizationId) { this.organizationId = organizationId; }
    public List<String> getProjects() { return projects; }
    public void setProjects(List<String> projects) { this.projects = projects; }
    public Long getDeactivated() { return deactivated; }
    public void setDeactivated(Long deactivated) { this.deactivated = deactivated; }
    public Long getInvited() { return invited; }
    public void setInvited(Long invited) { this.invited = invited; }
    public Long getCreatedAt() { return createdAt; }
    public void setCreatedAt(Long createdAt) { this.createdAt = createdAt; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
