package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.pojos.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {

    List<OrderStatus> findAll();

    Optional<OrderStatus> findById(int statusId);

    Optional<OrderStatus> findByStatus(String status);


}
