package com.luizmrd.repositories;

import com.luizmrd.entities.Category;
import com.luizmrd.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
