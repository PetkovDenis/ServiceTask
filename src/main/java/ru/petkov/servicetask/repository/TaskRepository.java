package ru.petkov.servicetask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ru.petkov.servicetask.model.Task;

@Service
public interface TaskRepository extends JpaRepository<Task,Long> {

}
