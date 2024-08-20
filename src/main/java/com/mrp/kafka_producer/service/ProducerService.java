package com.mrp.kafka_producer.service;

import com.mrp.kafka_producer.model.KafkaProducerRequest;
import com.mrp.kafka_producer.producer.Producer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ProducerService {
    void sendEvents(final KafkaProducerRequest request);
}
