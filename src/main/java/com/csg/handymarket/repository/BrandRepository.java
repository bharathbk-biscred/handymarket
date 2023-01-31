package com.csg.handymarket.repository;

import com.csg.handymarket.entity.Brand;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository extends CrudRepository<Brand,Integer> {
List<Brand> findAll();

    List<Brand> findAll(Sort by);
}
