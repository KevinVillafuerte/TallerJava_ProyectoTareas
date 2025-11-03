package com.hitss.springboot.app_crud_task.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hitss.springboot.app_crud_task.models.User;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AuthController {
    @PostMapping("/login")
    public ResponseEntity<?>login(@RequestBody User user){
        return ResponseEntity.ok("Este EndPoint es manejado por Spring Security.!");
    }
}
