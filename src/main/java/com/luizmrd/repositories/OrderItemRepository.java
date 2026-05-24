package com.luizmrd.repositories;

import com.luizmrd.entities.Category;
import com.luizmrd.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
