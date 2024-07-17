package com.torres.foro_hub_challenge.domain.topics;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

    @Query("SELECT t FROM Topic t ORDER BY t.creationDate DESC")
    Page<Topic> findTopicsDESC(Pageable pagination);
}
