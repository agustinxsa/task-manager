package com.salto.taskmanager.models;

import com.salto.taskmanager.enums.TaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private LocalDateTime dueDate;
    private boolean completed;

    public Task() {
        LocalDateTime createdAt = LocalDateTime.now();
        this.completed = false;
    }

}
