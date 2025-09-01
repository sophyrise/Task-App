package com.sophie.tasks.mappers;

import com.sophie.tasks.domain.dto.TaskListDto;
import com.sophie.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
