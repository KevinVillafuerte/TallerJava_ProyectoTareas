package com.hitss.springboot.app_crud_task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.app_crud_task.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    
}
