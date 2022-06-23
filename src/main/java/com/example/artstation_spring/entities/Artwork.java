package com.example.artstation_spring.entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

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

    @NotBlank(message = "image is required")
    @Column(name = "imageLink")
    private String artworkImageLink;

    @NotBlank(message = "details is required")
    @Column(name = "details")
    private String details;

    @Column(name = "hasMatureContent")
    private boolean hasMatureContent;

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

    public String getArtworkImageLink() {
        return artworkImageLink;
    }

    public void setArtworkImageLink(String artworkImageLink) {
        this.artworkImageLink = artworkImageLink;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isHasMatureContent() {
        return hasMatureContent;
    }

    public void setHasMatureContent(boolean hasMatureContent) {
        this.hasMatureContent = hasMatureContent;
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
