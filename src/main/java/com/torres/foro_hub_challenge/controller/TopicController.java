package com.torres.foro_hub_challenge.controller;

import com.torres.foro_hub_challenge.domain.topics.Topic;
import com.torres.foro_hub_challenge.domain.topics.TopicData;
import com.torres.foro_hub_challenge.domain.topics.TopicRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping
    public ResponseEntity<Page> getTopics(Pageable pagination) {
        return ResponseEntity.ok(topicRepository.findTopicsDESC(pagination).map((Topic title) -> new TopicData(title.getTitle(), title.getMessage(), title.getUser(), title.getCourse()))) ;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<TopicData> postTopic(@RequestBody @Valid TopicData topicData) {
        Topic topic = topicRepository.save(new Topic(topicData));
        return ResponseEntity.ok(new TopicData( topic.getTitle(), topic.getMessage(), topic.getUser(), topic.getCourse()));
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
    public ResponseEntity getTopic(@PathVariable Long id) {
        return ResponseEntity.ok(topicRepository.findById(id));
    }
}
