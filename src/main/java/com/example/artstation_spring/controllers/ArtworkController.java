package com.example.artstation_spring.controllers;

import com.example.artstation_spring.entities.Artwork;
import com.example.artstation_spring.entities.User;
import com.example.artstation_spring.exceptions.ResourceNotFoundException;
import com.example.artstation_spring.repositories.ArtworkRepository;
import com.example.artstation_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/artwork")
public class ArtworkController {

    private final ArtworkRepository artworkRepository;
    private final UserRepository userRepository;

    @Autowired
    public ArtworkController(ArtworkRepository artworkRepository, UserRepository userRepository) {
        this.artworkRepository = artworkRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/list")
    public List<Artwork> listArtworks(){
        return (List<Artwork>)artworkRepository.findAll();
    }

    @PostMapping("/add/{userId}")
    public ResponseEntity<Artwork> addArtwork(@RequestBody Artwork artwork,
                              @PathVariable("userId") long userId){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User By Id" + userId + "Not Found"));
        artwork.setUser(user);
       artworkRepository.save(artwork);
       return new ResponseEntity<>(artwork , HttpStatus.OK);
    }

    @PutMapping("update/{artworkId}")
    public ResponseEntity<Artwork> updateArtwork(@RequestBody Artwork artwork,
                                 @PathVariable("artworkId") long artworkId){
        artwork.setArtworkId(artworkId);
        artworkRepository.save(artwork);
        return new ResponseEntity<>(artwork , HttpStatus.OK);
    }

    @DeleteMapping("del/{artworkId}")
    public ResponseEntity<?> deleteArtwork(@PathVariable("artworkId") long artworkId){
        artworkRepository.deleteById(artworkId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
