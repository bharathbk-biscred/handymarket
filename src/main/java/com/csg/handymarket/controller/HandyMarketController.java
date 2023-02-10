package com.csg.handymarket.controller;


import com.csg.handymarket.entity.Brand;
import com.csg.handymarket.entity.Employee;
import com.csg.handymarket.entity.Product;


import com.csg.handymarket.service.BrandService;
import com.csg.handymarket.service.EmployeeService;
import com.csg.handymarket.service.ProductService;

import lombok.extern.slf4j.Slf4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class HandyMarketController {
    @Autowired
    private ProductService productService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private BrandService brandService;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployees() {
        log.debug("getAllEmployees is started");
        log.info("getAllEmployees");
        return employeeService.getEmployees();
    }

    @GetMapping("/getAllBrands")
    public List<Brand> getAllBrands() {

        return brandService.getBrands();
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
    @GetMapping("/getSortedBrand/{field}")
    public List<Brand>getSortedBrands(@PathVariable  String field){
        return brandService.getAllBrandsAfterSort(field);
    }
    @GetMapping("/getEmployeeById/{id}")
    public List<Brand> getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeByid(id);
    }
    @GetMapping("/getCount/{id}")
    public Long getCount(@PathVariable int id) {
        return employeeService.getCountOfEmployee(id);
    }
    @GetMapping("/getCountOfProduct/{id}")
    public long getCountOfbrand(@PathVariable int id){
        return brandService.getCountOfProduct(id);
    }

    @GetMapping("/getCountOfProducts/{id}")
    public Map<String, Integer> getCountOfEachBrand(@PathVariable int id){

        log.info("getCountOfBrands is started");
        return employeeService.getCountOfEachBrand(id);
    }


}
