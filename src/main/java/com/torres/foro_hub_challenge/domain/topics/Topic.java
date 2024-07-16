package com.torres.foro_hub_challenge.domain.topics;

import com.torres.foro_hub_challenge.domain.courses.Course;
import com.torres.foro_hub_challenge.domain.users.User;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String message;
    private Date creationDate;
    private Boolean status;

    @ManyToOne
    private User user;
    @ManyToOne
    private Course course;

    public Topic() {
    }

    public Topic(String title, String message, Date creationDate, Boolean status, User user, Course course) {
        this.title = title;
        this.message = message;
        this.creationDate = creationDate;
        this.status = status;
        this.user = user;
        this.course = course;
    }
}
