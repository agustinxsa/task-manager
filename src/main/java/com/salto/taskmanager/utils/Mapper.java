package com.salto.taskmanager.utils;

import com.salto.taskmanager.dto.TaskDto;
import com.salto.taskmanager.models.Task;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class Mapper {
    @Autowired
    private ModelMapper modelMapper;

    public TaskDto convertToDto(Task task) {
        return modelMapper.map(task, TaskDto.class);
    }

    public Task convertToEntity(TaskDto taskDto) {
        return modelMapper.map(taskDto, Task.class);
    }
}
