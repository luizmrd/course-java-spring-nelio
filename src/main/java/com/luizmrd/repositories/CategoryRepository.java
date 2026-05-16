package com.luizmrd.repositories;

import com.luizmrd.entities.Category;
import com.luizmrd.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
