package com.csg.handymarket.repository;

import com.csg.handymarket.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
}
