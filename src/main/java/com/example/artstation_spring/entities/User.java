package com.example.artstation_spring.entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long userId;

    @NotBlank(message = "fullname is required")
    @Column(name = "fullname")
    private String fullname;

    @NotBlank(message = "email is required")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "password is required")
    @Column(name = "password")
    private String password;

    @NotBlank(message = "headline is required")
    @Column(name = "headline")
    private String headline;

    @NotBlank(message = "summary is required")
    @Column(name = "summary")
    private String summary;

    @NotBlank(message = "city is required")
    @Column(name = "city")
    private String city;

    @NotBlank(message = "country is required")
    @Column(name = "country")
    private String country;

    @Column(name = "website")
    private String website;




}
