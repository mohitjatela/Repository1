package com.boot.application.repositoryinterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.application.entity.Employee;

////without annotation how can container get the object 
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
