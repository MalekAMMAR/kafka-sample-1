package com.ioevent.kafkasample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessageToTopic(String message) {
		kafkaTemplate.send("ioevent_k_topic", message);
	}
	
	@Transactional
	public void generateAndSendPackage() 
	      throws InterruptedException, TransactionException {
	   for (long i = 0; i < 10; i++) {
	      Order t = new Order(id++, i+1, i+2, 1000, "NEW");
	      ListenableFuture<SendResult<Long, Order>> result =
	         kafkaTemplate.send("transactions", t.getId(), t);
	      result.addCallback(callback);
	      Thread.sleep(1000);
	   }
	}
}
