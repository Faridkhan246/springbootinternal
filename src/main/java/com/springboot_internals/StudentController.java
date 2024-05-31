package com.springboot_internals;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//http://localhost:8080
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh","Fadtare");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){	
		List<Student> students=new ArrayList<>();
		students.add(new Student("Ramesh","Fadtare"));
		students.add(new Student("Tony","Stark"));
		students.add(new Student("Sanjay","Jadhav"));
		students.add(new Student("umesh","Fadtare"));
		return students;
	}
	
	
	
}
