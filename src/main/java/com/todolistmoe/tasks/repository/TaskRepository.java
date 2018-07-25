package com.todolistmoe.tasks.repository;

import com.todolistmoe.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository  extends CrudRepository<Task, Long> {

}
