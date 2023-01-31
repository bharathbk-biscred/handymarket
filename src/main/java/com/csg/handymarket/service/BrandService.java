package com.csg.handymarket.service;

import com.csg.handymarket.entity.Brand;
import com.csg.handymarket.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BrandService {

    @Autowired
    BrandRepository brandRepository;
    public List<Brand> getBrands(){
        return brandRepository.findAll();
    }
    public List<Brand> getAllBrandsAfterSort(String field) {

        return brandRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public Long getCountOfProduct(int id){
        Optional<Brand> brand=brandRepository.findById(id);
        return (long) brand.get().getProducts().size();
    }

}
