package com.sophie.tasks.domain.dto;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Integer count,
        Double progress,
        List<TaskDto> tasks
) {
}

// java record hold immutable data and provides me with getter methods(cause setter means changing instances and objects are immutable)
