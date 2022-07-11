package com.gl.studentsapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gl.studentsapi.model.Student;
import com.gl.studentsapi.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService studentService;
	
	@GetMapping
	public List<Student> fetchStudents() {
		return studentService.findAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student fetchStudent(@PathVariable("id") long studentId) {
		return studentService.findById(studentId);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") long studentId) {
		return studentService.updateStudent(student, studentId);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteStudent(@PathVariable("id") long studentId) {
		studentService.deleteStudent(studentId);
	}
	
}
