package com.mrp.kafka_producer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class KafkaProducerRequest implements Serializable {
    @JsonProperty("eventsToSave")
    private Map<String, String> eventsToSave = new LinkedHashMap<>();
}
