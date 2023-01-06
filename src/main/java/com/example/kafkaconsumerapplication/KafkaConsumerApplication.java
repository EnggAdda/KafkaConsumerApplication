package com.example.kafkaconsumerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class KafkaConsumerApplication {

	ArrayList<String> messages = new ArrayList<>();

	@GetMapping("/consumeFromTopic")
	public List<String> getMessageFromTopic(){
		return  messages;
	}
	@KafkaListener(groupId = "enggadda-1" , topics = "enggadda" ,containerFactory = "kafkaListenerContainerFactory")
	public List<String>  consumeFromTopic(String data){
		messages.add(data);
		return messages;
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}
