package com.boot.application.repositoryinterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.application.entity.Employee;

////without annotation how can container get the object   <--- haath dho kl iske piiche pad gya hai tu.🤣
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
