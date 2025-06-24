package com.example.screenshot;

import jakarta.persistence.*;

@Entity
@Table(name = "screenshots")
public class Screenshot {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String site;
    private Integer productivity;
    private String employeeId;
    private String appId;
    private String appOrgId;
    private String appTeamId;
    private String teamId;
    private String organizationId;
    private String srcEmployeeId;
    private String srcTeamId;
    private String timestampTranslated;
    private String systemPermissions; // For simplicity, store as JSON string or expand as needed
    private String next;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getSite() { return site; }
    public void setSite(String site) { this.site = site; }
    public Integer getProductivity() { return productivity; }
    public void setProductivity(Integer productivity) { this.productivity = productivity; }
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public String getAppId() { return appId; }
    public void setAppId(String appId) { this.appId = appId; }
    public String getAppOrgId() { return appOrgId; }
    public void setAppOrgId(String appOrgId) { this.appOrgId = appOrgId; }
    public String getAppTeamId() { return appTeamId; }
    public void setAppTeamId(String appTeamId) { this.appTeamId = appTeamId; }
    public String getTeamId() { return teamId; }
    public void setTeamId(String teamId) { this.teamId = teamId; }
    public String getOrganizationId() { return organizationId; }
    public void setOrganizationId(String organizationId) { this.organizationId = organizationId; }
    public String getSrcEmployeeId() { return srcEmployeeId; }
    public void setSrcEmployeeId(String srcEmployeeId) { this.srcEmployeeId = srcEmployeeId; }
    public String getSrcTeamId() { return srcTeamId; }
    public void setSrcTeamId(String srcTeamId) { this.srcTeamId = srcTeamId; }
    public String getTimestampTranslated() { return timestampTranslated; }
    public void setTimestampTranslated(String timestampTranslated) { this.timestampTranslated = timestampTranslated; }
    public String getSystemPermissions() { return systemPermissions; }
    public void setSystemPermissions(String systemPermissions) { this.systemPermissions = systemPermissions; }
    public String getNext() { return next; }
    public void setNext(String next) { this.next = next; }
}
