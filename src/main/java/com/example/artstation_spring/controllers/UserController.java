package com.example.artstation_spring.controllers;


import com.example.artstation_spring.entities.User;
import com.example.artstation_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/list")
    public List<User> listClients() {
        return (List<User>)userRepository.findAll();
    }
}
