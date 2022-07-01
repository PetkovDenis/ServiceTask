package ru.petkov.servicetask.service.crud;

import org.springframework.stereotype.Service;
import ru.petkov.servicetask.model.Task;
import ru.petkov.servicetask.repository.TaskRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository repository) {
        this.taskRepository = repository;
    }

    @Override
    @Transactional
    public void create(Task task) {
        taskRepository.save(task);
    }

    @Override
    @Transactional
    public Boolean delete(Long id) {
        boolean result;
        Task referenceById = taskRepository.getReferenceById(id);
        if (referenceById.getName() != null & !referenceById.getName().isEmpty()) {
            taskRepository.delete(referenceById);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    @Transactional
    public Task get(Long id) {
        return taskRepository.getReferenceById(id);
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Transactional
    public void update(Long id, Task task) {
        Task referenceById = taskRepository.getReferenceById(id);
        if (referenceById.getName() != null & !referenceById.getName().isEmpty()) {
            taskRepository.delete(referenceById);
            task.setId(id);
            taskRepository.save(task);
        }
    }
}
