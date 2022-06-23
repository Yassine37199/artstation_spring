package com.example.artstation_spring.repositories;

import com.example.artstation_spring.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User , Long> {

}
