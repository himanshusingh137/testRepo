package com.SpringBoot.SPBproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.SpringBoot.SPBproject.entity.Student;

@RestController
public class TestController {
	
	@GetMapping("start")
	public Student startStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("pankaj");
		student.setAge(21);
		return student;
				
	}
	
	@PutMapping("start")                    // we will retain end point name same for all request but we have change the type of request at time of getting in postman testing 
	public Student updateStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Pankaj Singh");
		student.setAge(21);
		return student;
	}
	
	@PostMapping("start")
	public Student saveStudent(@RequestBody Student student) {
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		return student;
	}     
	
	
	@PatchMapping("start")
	public Student saveSlightStudent(@RequestParam int id, @RequestParam String name) {  // For query parameter 
		System.out.println(id);
		System.out.println(name );   
		
		Student student = new Student();
		student.setId(id); 
		student.setName(name);
		return student;
	}
     
	@DeleteMapping("/start/{id}/{name}")
	public Student deleteStudent(@PathVariable int id ,@PathVariable String name) {
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		return student;
	}
}
