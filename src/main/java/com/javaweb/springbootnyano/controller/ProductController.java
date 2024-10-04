package com.javaweb.springbootnyano.controller;


import com.javaweb.springbootnyano.entity.ProductEntity;
import com.javaweb.springbootnyano.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value =  "/v1/api")

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/add")
    public ProductEntity createProduct(ProductEntity product) {
        System.out.println(product);
        return productService.createProduct(product);
    }


    @GetMapping(value = "/products")
    public List<ProductEntity> getAllProducts() {
        return productService.findAll();
    }
}
