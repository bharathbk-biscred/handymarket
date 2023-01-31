package com.csg.handymarket.service;

import com.csg.handymarket.entity.Product;
import com.csg.handymarket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
