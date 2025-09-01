package com.sophie.tasks.mappers;

import com.sophie.tasks.domain.dto.TaskDto;
import com.sophie.tasks.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
