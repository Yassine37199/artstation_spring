package com.example.artstation_spring.controllers;


import com.example.artstation_spring.entities.User;
import com.example.artstation_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/list")
    public List<User> listClients()
    {
        return (List<User>)userRepository.findAll();
    }


    @PostMapping("/add")
    public User addUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<User> UpdateTicket(@PathVariable("userId") Long id ,
                                                    @RequestBody User user) {
        user.setUserId(id);
        userRepository.save(user);
        return new ResponseEntity<>(user , HttpStatus.OK);
    }

    @DeleteMapping("/del/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") Long userId){
        userRepository.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
