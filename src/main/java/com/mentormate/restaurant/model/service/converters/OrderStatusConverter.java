package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.orderStatusDTO.OrderStatusDTO;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class OrderStatusConverter {

    public OrderStatusDTO toDto(OrderStatus entity) {
        OrderStatusDTO dto = new OrderStatusDTO();
        dto.setStatusId(entity.getStatusId());
        dto.setStatus(entity.getStatus());
        return dto;
    }

    public OrderStatus toEntity(OrderStatusDTO dto) {
        OrderStatus entity = new OrderStatus();
        entity.setStatusId(dto.getStatusId());
        entity.setStatus(dto.getStatus());

        return entity;
    }
}
