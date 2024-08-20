package com.mrp.kafka_producer.controller;


import com.mrp.kafka_producer.model.KafkaProducerRequest;
import com.mrp.kafka_producer.service.ProducerService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Data
@AllArgsConstructor
public class ProduceEventsController {
    @Autowired
    private ProducerService producerService;
    @PostMapping("/v1/post-events")
    public ResponseEntity<String> postEvent(@RequestBody KafkaProducerRequest request) {
        producerService.sendEvents(request);
        val response = Optional.of("SUCCESS");
        return ResponseEntity.of(response);
    }
}
