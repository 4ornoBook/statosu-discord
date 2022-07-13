package com.ua.statosudiscord.persistence.repositories;

import com.ua.statosudiscord.persistence.entities.Statistic;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface StatisticRepository extends MongoRepository<Statistic, Long> {
    List<Statistic> findByNextUpdateTime(LocalDateTime nextUpdateTime);
}
