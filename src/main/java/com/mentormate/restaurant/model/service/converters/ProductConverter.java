package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.productDTO.ProductDTO;
import com.mentormate.restaurant.model.pojos.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public ProductDTO toDto(Product entity) {
        ProductDTO dto = new ProductDTO();
        dto.setProductCategory(entity.getProductCategory());
        dto.setProductName(entity.getProductName());
        dto.setProductPrice(entity.getProductPrice());
        dto.setDescription(entity.getDescription());
        dto.setProductName(entity.getProductName());
        return dto;
    }

    public Product toEntity(ProductDTO dto) {
        Product entity = new Product();
        entity.setProductCategory(dto.getProductCategory());
        entity.setProductName(dto.getProductName());
        entity.setProductPrice(dto.getProductPrice());
        entity.setDescription(dto.getDescription());
        entity.setProductName(dto.getProductName());


        return entity;
    }
}
