package com.sophie.tasks.domain.dto;

import com.sophie.tasks.domain.entities.Task;
import com.sophie.tasks.domain.entities.TaskPriority;
import com.sophie.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto (
    UUID id,
    String title,
    String description,
    LocalDateTime dueDate,
    TaskPriority priority,
    TaskStatus status
) {

}
