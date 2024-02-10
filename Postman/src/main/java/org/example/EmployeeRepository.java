package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.example.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
