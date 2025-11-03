package com.hitss.springboot.app_crud_task.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.app_crud_task.models.User;


public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByUsername(String username);
    
    Optional<User> findByUsername(String username);
}
