package com.kafka;

import java.util.concurrent.ExecutionException;

public class KafkaProducerDemo {
    public static final String TOPIC = "testTopic";
     
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        boolean isAsync = false;
        SampleProducer producerThread = new SampleProducer(TOPIC, isAsync);
        producerThread.start();
    }
}