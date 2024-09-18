package com.einstein.ToDoList.controller;

import com.einstein.ToDoList.model.ToDoEntity;
import com.einstein.ToDoList.repository.ToDoRepository;
import com.einstein.ToDoList.services.ToDoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
@Api(value ="API REST Blog Posts")
@CrossOrigin(origins="*")
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/tasks")
    @ResponseBody
    @ApiOperation(value = "Return all tasks")
    public List<ToDoEntity> getToDoEntityList() {
        return toDoRepository.findAll();
    }

    @GetMapping("/tasks/{finished}")
    @ResponseBody
    @ApiOperation(value = "Return all tasks")
    public List<ToDoEntity> getToDoEntityListByFinished(@PathVariable(value = "finished") boolean finished) {
        return toDoService.getAllTasksByFinished(finished);
    }

    @GetMapping("/task/{taskId}")
    @ResponseBody
    @ApiOperation(value = "Return task by id")
    public ToDoEntity getToDoEntityListById(@PathVariable(value = "taskId") Long id) {
        return toDoService.getTaskById(id);
    }

    @PostMapping("/task")
    @ResponseBody
    @ApiOperation(value = "Create a new blog task")
    public ToDoEntity createToDoEntity(@RequestBody ToDoEntity task) {
        return toDoRepository.save(task);
    }

    @DeleteMapping("/task/{taskId}")
    @ResponseBody
    @ApiOperation(value="Delete a task by ID")
    public String deleteToDoEntity(@PathVariable(value = "taskId") Long taskId) {
        ToDoEntity task = toDoService.getTaskById(taskId);
        toDoRepository.delete(task);
        return "Task Deleted!";
    }

    @PutMapping("/task")
    @ResponseBody
    @ApiOperation(value="Update an existing task")
    public String updateToDoEntity(@RequestBody ToDoEntity updatedTask) {
        toDoRepository.save(updatedTask);
        return "Task updated";
    }
}
