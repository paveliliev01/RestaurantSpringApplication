package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.dto.orderStatusDTO.OrderStatusDTO;
import com.mentormate.restaurant.model.service.services.OrderStatusService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class OrderStatusController {

    private final OrderStatusService orderStatusService;

    @GetMapping("api/v1/order-statuses/getAll")
    public List<OrderStatusDTO> getAll() {
        return orderStatusService.getAll();
    }

    @GetMapping("api/v1/order-statuses/{orderStatusId}")
    public List<OrderStatusDTO> getById(@PathVariable final int orderStatusId) {
        return orderStatusService.getById(orderStatusId);
    }

    @GetMapping("api/v1/order-statuses")
    public OrderStatusDTO getByStatusName(@RequestParam final String orderStatusName) {
        return orderStatusService.getByName(orderStatusName);
    }


}