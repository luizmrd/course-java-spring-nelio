package com.luizmrd.config;

import com.luizmrd.entities.Order;
import com.luizmrd.entities.User;
import com.luizmrd.repositories.OrderRepository;
import com.luizmrd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria","maria@gmail","2121212","323232");
        User u2 = new User(null,"Lucas","lucas@gmail","31211212","323232");

        Order o1 = new Order(null, Instant.parse("2025-05-20T19:53:07Z"),u1);
        Order o2 = new Order(null, Instant.parse("2025-05-21T20:53:07Z"),u2);


        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2));


    }
}
