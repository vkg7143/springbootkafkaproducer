package com.vcs.kafkaproducer.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.vcs.kafkaproducer.config.ProducerConfig;
import com.vcs.kafkaproducer.model.Student;

@Service 
public class StudentService {
	private static final String kafkaTopic="student";
	
	 private final Logger LOG = LoggerFactory.getLogger(StudentService.class);
	 @Autowired
	 ProducerConfig pc=new ProducerConfig();
	 KafkaTemplate<String,Student> kafkaTemplate=pc.studentTemplate();
	 
	 public void send(Student student)
	 {
		 
		 
		 try {
			 
		 
	        
			kafkaTemplate.send(kafkaTopic,student);
			System.out.println("data sent");
		 }
		 catch(Exception e)
		 {
			System.out.print(e);
		 }
	 }
}


