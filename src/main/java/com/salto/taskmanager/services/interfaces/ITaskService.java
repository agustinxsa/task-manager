package com.salto.taskmanager.services.interfaces;

import com.salto.taskmanager.dto.TaskDto;
import com.salto.taskmanager.enums.TaskStatus;

public interface ITaskService {
    public TaskDto getTaskById(Long taskId);
    public boolean createNewTask(TaskDto taskDto);
    public TaskDto modifiedTask(Long taskId, TaskDto taskDto);
    public boolean changeStatus(Long taskId, TaskStatus taskStatus);
    public boolean removeTask(Long taskId);
}
