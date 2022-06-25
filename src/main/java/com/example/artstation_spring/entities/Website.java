package com.example.artstation_spring.entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Website {

    @Id
    @SequenceGenerator(
            name = "website_sequence",
            sequenceName = "website_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "website_sequence"
    )
    private long websiteId;

    @Column(name = "websiteType")
    private String websiteType;

    @Column(name = "websiteLink")
    private String websiteLink;

    public long getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(long websiteId) {
        this.websiteId = websiteId;
    }

    public String getWebsiteType() {
        return websiteType;
    }

    public void setWebsiteType(String websiteType) {
        this.websiteType = websiteType;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
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
