package com.leek.demo3_springsec.service;

import com.leek.demo3_springsec.Entity.Product;

import java.util.List;

public interface ProductServices {
    void delete(Long id);
    Product get(Long id);
    Product save(Product product);
    List<Product> getAll();
}
