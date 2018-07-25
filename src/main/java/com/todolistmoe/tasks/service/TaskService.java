package com.todolistmoe.tasks.service;

import com.todolistmoe.tasks.domain.Task;

public interface TaskService {
  Iterable<Task> list();

  Task save(Task task);
}
