package com.vcs.kafkaproducer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vcs.kafkaproducer.service.StudentService;

@SpringBootApplication
public class KafkaproducerApplication {
	StudentService studentService = new StudentService();

	public static void main(String[] args) {

		SpringApplication.run(KafkaproducerApplication.class, args);

	}

}
