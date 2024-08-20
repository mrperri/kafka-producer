package com.mrp.kafka_producer.producer;

public interface Producer {
     void sendEvent(final String key, final String value);
}
