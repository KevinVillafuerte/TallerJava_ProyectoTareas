package com.hitss.springboot.app_crud_task.services;

import java.util.List;
import java.util.Optional;

import com.hitss.springboot.app_crud_task.models.Task;

public interface TaskServicie {

    //Se crean los metodos para el CRUD -> Listar, Buscar por ID, crear, Actualizar y Eliminar
    //Listar Tareas
    List<Task> findAll();

    //Buscar Tarea por Id
    Optional<Task> findById(Long id);

    //Guardar Tarea
    Task save(Task task);

    //Actualizar Tarea
    Optional<Task> update(Long id, Task task);

    //Eliminar Tarea
    Optional<Task> delete(Long id);
}
