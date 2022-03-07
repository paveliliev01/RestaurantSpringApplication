package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.pojos.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TableRepository extends JpaRepository<Table, Integer> {

    List<Table> findAll();

    Optional<Table> findByTableNumber(Integer tableNumber);

    Optional<Table> findById(Integer tableId);
}
