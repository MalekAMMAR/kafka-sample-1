package com.ioevent.kafkasample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessageToTopic(String message) {
		kafkaTemplate.send("ioevent_k_topic", message);
	}
}
