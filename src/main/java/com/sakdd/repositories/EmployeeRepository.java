package com.sakdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakdd.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
