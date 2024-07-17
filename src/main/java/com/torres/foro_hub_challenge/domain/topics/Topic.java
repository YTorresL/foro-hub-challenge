package com.torres.foro_hub_challenge.domain.topics;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String message;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    private Boolean status;

    @Column(name = "user_id")
    private Long user;
    @Column(name = "course_id")
    private Long course;

    public Topic() {
    }

    public Topic(TopicData topicData) {
        this.title = topicData.title();
        this.message = topicData.message();
        this.creationDate = LocalDateTime.now();
        this.status = true;
        this.user = topicData.userId();
        this.course = topicData.courseId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Long getCourse() {
        return course;
    }

    public void setCourse(Long course) {
        this.course = course;
    }
}
