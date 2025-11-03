package com.hitss.springboot.app_crud_task.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.app_crud_task.models.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);
}
