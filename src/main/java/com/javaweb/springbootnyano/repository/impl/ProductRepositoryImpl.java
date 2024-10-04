package com.javaweb.springbootnyano.repository.impl;

import com.javaweb.springbootnyano.entity.ProductEntity;
import com.javaweb.springbootnyano.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Java Spring Boot ADD");
        productEntity.setProductPrice(new BigDecimal("21.6"));

        return productEntity;
    }

    @Override
    public List<ProductEntity> findAll() {
        ProductEntity productEntity = new ProductEntity();
        List<ProductEntity> items = new ArrayList<ProductEntity>();

        productEntity.setId(1L);
        productEntity.setProductName("Java Spring Boot");
        productEntity.setProductPrice(new BigDecimal("21.6"));

        items.add(productEntity);

        return items;
    }

}
