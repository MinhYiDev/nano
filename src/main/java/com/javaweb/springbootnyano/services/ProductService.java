package com.javaweb.springbootnyano.services;

import com.javaweb.springbootnyano.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public interface ProductService {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAll();
}
