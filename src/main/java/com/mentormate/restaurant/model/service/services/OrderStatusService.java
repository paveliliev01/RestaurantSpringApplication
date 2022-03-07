package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.orderStatusDTO.OrderStatusDTO;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.repository.OrderStatusRepository;
import com.mentormate.restaurant.model.service.converters.OrderStatusConverter;
import com.mentormate.restaurant.model.service.converters.RoleConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderStatusService {

    private final OrderStatusRepository orderStatusRepository;
    private final OrderStatusConverter orderStatusConverter;

    public OrderStatusService(OrderStatusRepository orderStatusRepository, RoleConverter roleConverter, OrderStatusConverter orderStatusConverter) {
        this.orderStatusRepository = orderStatusRepository;
        this.orderStatusConverter = orderStatusConverter;
    }

    public List<OrderStatusDTO> getAll() {
        List<OrderStatus> orderStatusList = orderStatusRepository.findAll();
        List<OrderStatusDTO> orderStatusDTO = orderStatusList.stream().map(orderStatusConverter::toDto).collect(Collectors.toList());
        return orderStatusDTO;
    }

    public List<OrderStatusDTO> getById(int statusId) {
        List<OrderStatusDTO> orderStatusDTOS = new ArrayList<>();
        if (orderStatusRepository.findById(statusId).isEmpty()) {
            return getAll();
        }
        orderStatusDTOS.add(orderStatusConverter.toDto(orderStatusRepository.findById(statusId).get()));
        return orderStatusDTOS;
    }

    public OrderStatusDTO getByName(String statusName) {
        return orderStatusConverter.toDto(orderStatusRepository.findByStatus(statusName).get());
    }

}


