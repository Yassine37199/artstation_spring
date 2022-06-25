package com.example.artstation_spring.entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

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

    @Column(name = "AvatarImageLink")
    private String AvatarImageLink;

    @Column(name = "CoverImageLink")
    private String CoverImageLink;

    @Column(name = "DemoReelLink")
    private String DemoReelLink;

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

    @Column(name = "createdAt")
    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getAvatarImageLink() {
        return AvatarImageLink;
    }

    public void setAvatarImageLink(String avatarImageLink) {
        AvatarImageLink = avatarImageLink;
    }

    public String getCoverImageLink() {
        return CoverImageLink;
    }

    public void setCoverImageLink(String coverImageLink) {
        CoverImageLink = coverImageLink;
    }

    public String getDemoReelLink() {
        return DemoReelLink;
    }

    public void setDemoReelLink(String demoReelLink) {
        DemoReelLink = demoReelLink;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
