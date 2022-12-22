package com.ioevent.kafkasample;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class IoeventKafkaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoeventKafkaSampleApplication.class, args);
	}

	@Bean
	public NewTopic transactionsTopic() {
		return TopicBuilder.name("transactions").partitions(3).replicas(1).build();
	}

}
