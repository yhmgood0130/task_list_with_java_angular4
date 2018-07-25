package com.todolistmoe.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Task {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  @JsonFormat(pattern = "MM/dd/yyyy")
  private LocalDate dueDate;
  private Boolean completed;

  public Task() {

  }
}
