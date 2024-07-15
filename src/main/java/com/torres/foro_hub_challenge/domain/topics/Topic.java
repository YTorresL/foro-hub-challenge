package com.torres.foro_hub_challenge.domain.topics;

import jakarta.persistence.*;

@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
