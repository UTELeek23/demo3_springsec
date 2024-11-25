package com.leek.demo3_springsec.Repository;


import com.leek.demo3_springsec.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {
}
