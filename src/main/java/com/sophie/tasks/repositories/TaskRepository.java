package com.sophie.tasks.repositories;

import com.sophie.tasks.domain.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByTaskList_Id(UUID taskListId);
    Optional<Task> findByTaskList_IdAndId(UUID taskListId, UUID id);
}
