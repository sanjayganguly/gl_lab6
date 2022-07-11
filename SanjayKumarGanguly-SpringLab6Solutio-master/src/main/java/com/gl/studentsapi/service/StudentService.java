package com.gl.studentsapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gl.studentsapi.model.Student;
import com.gl.studentsapi.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;
	
	@Transactional
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Transactional
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	@Transactional
	public Student findById(long id) {
		return studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("No student found."));
	}

	@Transactional
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}
	
	@Transactional
	public Student updateStudent(Student student, long studentId) {
		return studentRepository.save(student);
	}
}
