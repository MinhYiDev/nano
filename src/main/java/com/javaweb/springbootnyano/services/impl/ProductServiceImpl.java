package com.javaweb.springbootnyano.services.impl;

import com.javaweb.springbootnyano.entity.ProductEntity;
import com.javaweb.springbootnyano.repository.ProductRepository;
import com.javaweb.springbootnyano.services.ProductService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.createProduct(product);
    }

    @Override
    public List<ProductEntity> findAll() {
       return productRepository.findAll();
    }
}
