package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.productCategoryDTO.ProductCategoryDTO;
import com.mentormate.restaurant.model.pojos.ProductCategory;
import com.mentormate.restaurant.model.repository.ProductCategoryRepository;
import com.mentormate.restaurant.model.service.converters.ProductCategoryConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductCategoryService {
    private final ProductCategoryRepository productCategoryRepository;
    private final ProductCategoryConverter productCategoryConverter;

    public ProductCategoryService(ProductCategoryRepository productCategoryRepository, ProductCategoryConverter productCategoryConverter) {
        this.productCategoryRepository = productCategoryRepository;
        this.productCategoryConverter = productCategoryConverter;
    }


    public List<ProductCategoryDTO> getAllCategories() {
        List<ProductCategory> categoryList = productCategoryRepository.findAll();
        List<ProductCategoryDTO> productCategoryDTOSDTOStream = categoryList.stream().map(productCategoryConverter::toDto).collect(Collectors.toList());
        return productCategoryDTOSDTOStream;
    }

    public ProductCategoryDTO getById(int roleId) {
        return productCategoryConverter.toDto(productCategoryRepository.findById(roleId).get());
    }

    public ProductCategoryDTO getByName(String categoryName) {
        return productCategoryConverter.toDto(productCategoryRepository.findByCategoryName(categoryName).get());
    }

    public ProductCategoryDTO createCategory(ProductCategoryDTO productCategoryDTO) {
        final ProductCategory productCategory = productCategoryConverter.toEntity(productCategoryDTO);
        final ProductCategory saved = productCategoryRepository.save(productCategory);
        return productCategoryConverter.toDto(saved);
    }
}
