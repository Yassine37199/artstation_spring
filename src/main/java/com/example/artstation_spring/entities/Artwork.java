package com.example.artstation_spring.entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Artwork {

    @Id
    @SequenceGenerator(
            name = "artwork_sequence",
            sequenceName = "artwork_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "artwork_sequence"
    )
    private long artworkId;

    @NotBlank(message = "title is required")
    @Column(name = "title")
    private String title;

    @Column(name = "artworkImageLinks")
    private String artworkImageLinks;

    @NotBlank(message = "image is required")
    @Column(name = "projectThumbnailLink")
    private String projectThumbnailLink;

    
    @Column(
            columnDefinition = "LONGTEXT" )
    private String description;

    @Column(name = "hasMatureContent")
    private boolean hasMatureContent;

    @Column(name = "creation_date")
    private LocalDate creation_date;

    public long getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(long artworkId) {
        this.artworkId = artworkId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHasMatureContent() {
        return hasMatureContent;
    }

    public void setHasMatureContent(boolean hasMatureContent) {
        this.hasMatureContent = hasMatureContent;
    }

    public String getArtworkImageLinks() {
        return artworkImageLinks;
    }

    public void setArtworkImageLinks(String artworkImageLinks) {
        this.artworkImageLinks = artworkImageLinks;
    }

    public String getProjectThumbnailLink() {
        return projectThumbnailLink;
    }

    public void setProjectThumbnailLink(String projectThumbnailLink) {
        this.projectThumbnailLink = projectThumbnailLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = LocalDate.now();
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
