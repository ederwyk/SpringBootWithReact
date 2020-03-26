package com.wyk.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.wyk.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
