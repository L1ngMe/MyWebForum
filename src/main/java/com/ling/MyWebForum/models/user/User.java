package com.ling.MyWebForum.models.user;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 16, nullable = false, columnDefinition = "TEXT")
    private String name;

    @Column(name = "date_of_creating", nullable = false, columnDefinition = "TIMESTAMP")
    private Date dateOfCreating;


    public User(String name, Date dateOfCreating) {
        this.name = name;
        this.dateOfCreating = dateOfCreating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfCreating(Date dateOfCreating) {
        this.dateOfCreating = dateOfCreating;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfCreating() {
        return dateOfCreating;
    }
}
