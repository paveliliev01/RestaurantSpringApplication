package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.orderDTO.OrderDTO;
import com.mentormate.restaurant.model.pojos.Order;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.pojos.Table;
import com.mentormate.restaurant.model.pojos.User;
import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.repository.OrderStatusRepository;
import com.mentormate.restaurant.model.service.converters.OrderConverter;
import com.mentormate.restaurant.model.service.converters.OrderStatusConverter;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class OrderService {
    OrderRepository orderRepository;
    OrderConverter orderConverter;
    OrderStatusService orderStatusService;
    OrderStatusConverter orderStatusConverter;
    OrderStatusRepository orderStatusRepository;

    public OrderDTO createOrder(User waiter, Table table, OrderStatus orderStatus) {
        java.util.Date date = new java.util.Date();
        final Order order = new Order(1, table, waiter, orderStatus, new Date(date.getTime()));
        final Order savedOrder = orderRepository.save(order);
        return orderConverter.toDto(order);
    }


}
