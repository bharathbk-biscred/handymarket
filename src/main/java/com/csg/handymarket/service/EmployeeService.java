package com.csg.handymarket.service;

import com.csg.handymarket.entity.Brand;
import com.csg.handymarket.entity.Employee;
import com.csg.handymarket.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    public List<Brand> getEmployeeByid(int id) {
        Optional<Employee> employeeDetails = employeeRepository.findById(id);
        return employeeDetails.get().getBrand_id().stream().sorted(Comparator.comparing(Brand::getName)).collect(Collectors.toList());
    }
    public Long  getCountOfEmployee(int id){
        Optional<Employee> employee=employeeRepository.findById(id);


        return (long) employee.get().getBrand_id().size();//we can use count also here
    }


    public Map<String, Integer> getCountOfEachBrand(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        return employee.get().getBrand_id().stream().collect(Collectors.toMap(Brand::getName, b->b.getProducts().size()));
    }

}
