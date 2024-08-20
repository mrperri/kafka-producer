package com.mrp.kafka_producer.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DefaultProducerImpl implements Producer{

    private static final String topicName = "my_topic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendEvent(String key, String value) {
        kafkaTemplate.send(topicName, key, value);
    }

}
