package com.gl.studentsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studentsapi.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
