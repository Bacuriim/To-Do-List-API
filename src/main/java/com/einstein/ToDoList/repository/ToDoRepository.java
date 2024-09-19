package com.einstein.ToDoList.repository;

import com.einstein.ToDoList.model.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Long> {

    ToDoEntity findTaskByTitle(String title);
    ToDoEntity findTaskById(Long id);
    List<ToDoEntity> findAllTasksByFinished(boolean finished);
    boolean existsByTitle(String title);
    boolean existsById(Long id);
    void delete(ToDoEntity task);
}
