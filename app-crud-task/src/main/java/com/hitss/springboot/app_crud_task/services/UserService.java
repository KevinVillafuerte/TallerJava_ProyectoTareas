package com.hitss.springboot.app_crud_task.services;

import java.util.List;

import com.hitss.springboot.app_crud_task.models.User;

public interface UserService {

    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
