package com.salto.taskmanager.controllers;

import com.salto.taskmanager.dto.TaskDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    public TaskController() {
    }

    @GetMapping("get-task/{id}")
    public ResponseEntity<TaskDto> getTaskById(@PathVariable Long taskId) {

    }

}
