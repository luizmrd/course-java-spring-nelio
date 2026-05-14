package com.luizmrd.repositories;

import com.luizmrd.entities.Order;
import com.luizmrd.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
