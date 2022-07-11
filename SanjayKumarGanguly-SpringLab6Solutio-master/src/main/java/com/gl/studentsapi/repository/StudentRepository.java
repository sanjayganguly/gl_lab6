package com.gl.studentsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.studentsapi.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
