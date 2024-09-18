package com.einstein.ToDoList.services;

import com.einstein.ToDoList.model.ToDoEntity;
import com.einstein.ToDoList.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public ToDoEntity getTaskByTitle(String title) {
        return toDoRepository.findTaskByTitle(title);
    }
    public ToDoEntity getTaskById(Long id) {
        return toDoRepository.findTaskById(id);
    }
    public List<ToDoEntity> getAllTasksByFinished(boolean finished) {
        return toDoRepository.findAllTasksByFinished(finished);
    }
}
