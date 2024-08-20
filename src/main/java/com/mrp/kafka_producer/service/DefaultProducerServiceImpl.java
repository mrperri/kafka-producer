package com.mrp.kafka_producer.service;


import com.mrp.kafka_producer.model.KafkaProducerRequest;
import com.mrp.kafka_producer.producer.Producer;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@Slf4j
public class DefaultProducerServiceImpl implements ProducerService{
    @Autowired
    private Producer kafkaProducer;

    public void sendEvents(final KafkaProducerRequest request) {
        request.getEventsToSave().forEach( (k,v) -> kafkaProducer.sendEvent(k, v));
    }
}
