package com.Task.TaskSpringBoot.Repository;

import com.Task.TaskSpringBoot.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

}
