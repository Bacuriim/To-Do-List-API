package com.einstein.ToDoList.repository;

import com.einstein.ToDoList.model.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, String> {

    ToDoEntity findTaskByTitle(String title);
    ToDoEntity findTaskById(Long id);
    List<ToDoEntity> findAllTasksByFinished(boolean finished);
    void delete(ToDoEntity task);
}
