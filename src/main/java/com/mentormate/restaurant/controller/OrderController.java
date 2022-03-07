package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.repository.TableRepository;
import com.mentormate.restaurant.model.service.services.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    OrderService orderService;
    OrderRepository orderRepository;
    TableRepository tableRepository;
//    UserRepository userRepository;
//    @PutMapping("api/v1/createOrder")
//    public OrderDTO createOrder(@RequestParam User waiter,@RequestParam Table table){
//        return orderService.createOrder(waiter,table );
//    }
}
