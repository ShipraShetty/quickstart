package com.example.demo;

import com.example.demo.entity.Student;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("api/v1/students")
public class StudentService {
	
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	public Student getName() {
		return new Student(1020,"Ramesh",90);
	}
}
