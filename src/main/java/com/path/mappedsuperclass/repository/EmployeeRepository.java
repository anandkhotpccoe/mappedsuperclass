package com.path.mappedsuperclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.path.mappedsuperclass.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
