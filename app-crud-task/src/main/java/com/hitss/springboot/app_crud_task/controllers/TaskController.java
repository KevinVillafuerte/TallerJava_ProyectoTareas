package com.hitss.springboot.app_crud_task.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitss.springboot.app_crud_task.models.Task;
import com.hitss.springboot.app_crud_task.services.TaskServicie;
import com.hitss.springboot.app_crud_task.utils.UtilCrud;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tasks")
@Tag(
    name = "Task Controller",
    description = "EndPoint"
)
public class TaskController {

    private TaskServicie taskServicie;

    public TaskController(TaskServicie taskServicie) {
        this.taskServicie = taskServicie;
    }

    @Operation(summary = "Get all Task", description = "Retrieves all registered ...")
    @GetMapping
    public List<Task> list(){
        return taskServicie.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Long id){
        Optional<Task> taskOptional = taskServicie.findById(id);
        if (taskOptional.isPresent()) {
            return ResponseEntity.ok(taskOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Task task, 
                                        BindingResult result ){
        if (result.hasFieldErrors()) {
            return UtilCrud.validation(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED)
                                .body(taskServicie.save(task));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> update(@Valid @RequestBody Task task,
                                        BindingResult result,
                                        @PathVariable Long id){
        
        if (result.hasFieldErrors()) {
            return UtilCrud.validation(result);
        }
        Optional<Task> optional = taskServicie.update(id, task);
        if (optional.isPresent()) {
            return ResponseEntity.status(HttpStatus.CREATED).body(optional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<Task> optional = taskServicie.delete(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    
}
