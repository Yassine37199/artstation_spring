package com.example.artstation_spring.repositories;


import com.example.artstation_spring.entities.Artwork;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtworkRepository extends CrudRepository<Artwork , Long> {

}
