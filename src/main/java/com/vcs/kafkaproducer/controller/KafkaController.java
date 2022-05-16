package com.vcs.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.kafkaproducer.model.Student;
import com.vcs.kafkaproducer.service.StudentService;


@RestController
public class KafkaController {
	
	
	@Autowired
	StudentService studentService;

	@PostMapping("/publish")
	public String publish(@RequestBody Student student )
	{
		studentService.send(student);
		return "Message sent successfully";
		
	}

}
