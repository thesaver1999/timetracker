package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    public Task createTask(Task task) {
        task.setCreatedAt(System.currentTimeMillis());
        return taskRepository.save(task);
    }

    public Optional<Task> updateTask(String id, Task updated) {
        return taskRepository.findById(id).map(existing -> {
            existing.setStatus(updated.getStatus());
            existing.setPriority(updated.getPriority());
            existing.setBillable(updated.isBillable());
            existing.setName(updated.getName());
            existing.setProjectId(updated.getProjectId());
            existing.setEmployees(updated.getEmployees());
            existing.setDescription(updated.getDescription());
            existing.setCreatorId(updated.getCreatorId());
            existing.setOrganizationId(updated.getOrganizationId());
            existing.setTeams(updated.getTeams());
            // ... add other fields as needed
            return taskRepository.save(existing);
        });
    }

    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }
}
