package com.example.artstation_spring.entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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
    @ElementCollection
    private List<String> artworkImageLinks;

    @NotBlank(message = "image is required")
    @Column(name = "projectThumbnailLink")
    private String projectThumbnailLink;

    @NotBlank(message = "description is required")
    @Column(name = "description")
    private String description;

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

    public boolean isHasMatureContent() {
        return hasMatureContent;
    }

    public void setHasMatureContent(boolean hasMatureContent) {
        this.hasMatureContent = hasMatureContent;
    }

    public List<String> getArtworkImageLinks() {
        return artworkImageLinks;
    }

    public void setArtworkImageLinks(List<String> artworkImageLinks) {
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
