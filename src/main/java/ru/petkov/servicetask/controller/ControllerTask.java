package ru.petkov.servicetask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.petkov.servicetask.model.Task;
import ru.petkov.servicetask.service.crud.TaskServiceImpl;

import java.util.List;

@RestController
@RequestMapping("task")
public class ControllerTask {

    private final TaskServiceImpl service;

    public ControllerTask(TaskServiceImpl servicee) {
        this.service = servicee;
    }

    @GetMapping("/add")
    public void add() {
        service.create(new Task(522L,"dddd", "ssss"));
    }

    @GetMapping("/list")
    public List<Task> getAll(){
       return service.getAll();
    }
}
