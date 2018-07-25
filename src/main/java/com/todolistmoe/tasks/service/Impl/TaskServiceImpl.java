package com.todolistmoe.tasks.service.Impl;

import com.todolistmoe.tasks.domain.Task;
import com.todolistmoe.tasks.repository.TaskRepository;
import com.todolistmoe.tasks.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

  private TaskRepository taskRepository;

  public TaskServiceImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public Iterable<Task> list() {
    return this.taskRepository.findAll();
  }

  @Override
  public Task save(Task task) {
    return this.taskRepository.save(task);
  }
}
