package com.csg.handymarket.repository;

import com.csg.handymarket.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    List<Employee> findAll();
}
