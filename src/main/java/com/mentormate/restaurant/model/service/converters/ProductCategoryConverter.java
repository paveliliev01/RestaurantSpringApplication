package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.productCategoryDTO.ProductCategoryDTO;
import com.mentormate.restaurant.model.pojos.ProductCategory;
import org.springframework.stereotype.Component;

@Component
public class ProductCategoryConverter {

    public ProductCategoryDTO toDto(ProductCategory entity) {
        ProductCategoryDTO dto = new ProductCategoryDTO();
        dto.setId(entity.getId());
        dto.setCategoryName(entity.getCategoryName());
        return dto;
    }

    public ProductCategory toEntity(ProductCategoryDTO dto) {
        ProductCategory entity = new ProductCategory();
        entity.setId(dto.getId());
        entity.setCategoryName(dto.getCategoryName());

        return entity;
    }
}
