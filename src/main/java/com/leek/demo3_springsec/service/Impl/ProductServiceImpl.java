package com.leek.demo3_springsec.service.Impl;

import com.leek.demo3_springsec.Entity.Product;
import com.leek.demo3_springsec.Repository.ProductRepository;
import com.leek.demo3_springsec.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductServices {
    @Autowired
    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
    @Override
    public Product get(Long id) {
        return productRepository.findById(id).get();
    }
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
