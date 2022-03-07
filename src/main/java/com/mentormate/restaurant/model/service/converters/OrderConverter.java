package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.orderDTO.OrderDTO;
import com.mentormate.restaurant.model.pojos.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public OrderDTO toDto(Order entity) {
        OrderDTO dto = new OrderDTO();
        dto.setOrderId(entity.getOrderId());
        dto.setOrderDate(entity.getOrderDate());
        dto.setOrderStatus(entity.getOrderStatus());
        dto.setTable(entity.getTable());
        dto.setWaiter(entity.getWaiter());
        return dto;
    }

    public Order toEntity(OrderDTO dto) {
        Order entity = new Order();
        entity.setOrderId(dto.getOrderId());
        entity.setOrderDate(dto.getOrderDate());
        entity.setOrderStatus(dto.getOrderStatus());
        entity.setTable(dto.getTable());
        entity.setWaiter(dto.getWaiter());

        return entity;
    }
}
