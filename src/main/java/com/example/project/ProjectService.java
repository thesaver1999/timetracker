package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(String id) {
        return projectRepository.findById(id);
    }

    public Project createProject(Project project) {
        project.setCreatedAt(System.currentTimeMillis());
        return projectRepository.save(project);
    }

    public Optional<Project> updateProject(String id, Project updated) {
        return projectRepository.findById(id).map(existing -> {
            existing.setArchived(updated.isArchived());
            existing.setStatuses(updated.getStatuses());
            existing.setPriorities(updated.getPriorities());
            existing.setBillable(updated.isBillable());
            existing.setName(updated.getName());
            existing.setDescription(updated.getDescription());
            existing.setEmployees(updated.getEmployees());
            existing.setCreatorId(updated.getCreatorId());
            existing.setOrganizationId(updated.getOrganizationId());
            existing.setTeams(updated.getTeams());
            // ... add other fields as needed
            return projectRepository.save(existing);
        });
    }

    public void deleteProject(String id) {
        projectRepository.deleteById(id);
    }
}
