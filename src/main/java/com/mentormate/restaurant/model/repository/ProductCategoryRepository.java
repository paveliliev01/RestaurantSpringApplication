package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.pojos.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findAll();

    Optional<ProductCategory> findById(int id);

    Optional<ProductCategory> findByCategoryName(String categoryName);
}
