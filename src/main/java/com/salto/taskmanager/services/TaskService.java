package com.salto.taskmanager.services;

import com.salto.taskmanager.dto.TaskDto;
import com.salto.taskmanager.enums.TaskStatus;
import com.salto.taskmanager.models.Task;
import com.salto.taskmanager.repositories.TaskRepository;
import com.salto.taskmanager.services.interfaces.ITaskService;
import com.salto.taskmanager.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService implements ITaskService {
    private final TaskRepository taskRepository;
    private final Mapper mapper;

    @Autowired
    public TaskService(TaskRepository taskRepository, Mapper mapper) {
        this.taskRepository = taskRepository;
        this.mapper = mapper;
    }

    @Override
    public TaskDto getTaskById(Long taskId) {
        Optional<Task> task = taskRepository.findById(taskId);
        return task.isPresent() ? mapper.convertToDto(task.get()): null;
    }

    @Override
    public boolean createNewTask(TaskDto taskDto) {
        return false;
    }

    @Override
    public TaskDto modifiedTask(Long taskId, TaskDto taskDto) {
        return null;
    }

    @Override
    public boolean changeStatus(Long taskId, TaskStatus taskStatus) {
        return false;
    }

    @Override
    public boolean removeTask(Long taskId) {
        return false;
    }
}
