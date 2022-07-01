package ru.petkov.servicetask.service.crud;

import org.springframework.stereotype.Service;
import ru.petkov.servicetask.model.Task;

import java.util.List;

@Service
public interface TaskService {

    void create(Task task);

    Boolean delete(Long id);

    Task get(Long id);

    List<Task> getAll();
}
