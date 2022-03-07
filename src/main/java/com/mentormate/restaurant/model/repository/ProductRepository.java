package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.dto.productDTO.ProductDTO;
import com.mentormate.restaurant.model.pojos.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Override
    @Query(value = "select * from products p where p.soft_delete=0", nativeQuery = true)
    public List<Product> findAll();

    Optional<Product> findById(Integer id);

    Optional<ProductDTO> save(ProductDTO productDTO);


}
