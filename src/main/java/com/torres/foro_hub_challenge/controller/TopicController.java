package com.torres.foro_hub_challenge.controller;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @GetMapping
    public String getTopics() {
        return "Topics";
    }

    @PostMapping
    @Transactional
    public String postTopic() {
        return "Topic created";
    }

    @PutMapping
    @Transactional
    public String putTopic() {
        return "Topic updated";
    }

    @DeleteMapping("/{id}")
    @Transactional
    public String deleteTopic(@PathVariable Long id) {
        return "Topic deleted";
    }

    @GetMapping("/{id}")
    public String getTopic(@PathVariable Long id) {
        return "Topic";
    }
}
