package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.dto.productCategoryDTO.ProductCategoryDTO;
import com.mentormate.restaurant.model.service.services.ProductCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductCategoryController {
    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }


    @GetMapping("api/v1/allCategories")
    public List<ProductCategoryDTO> getAll() {
        return productCategoryService.getAllCategories();
    }

    @GetMapping("api/v1/product-categories/{productCategoryId}")
    public ProductCategoryDTO getById(@PathVariable final int productCategoryId) {
        return productCategoryService.getById(productCategoryId);
    }

    @GetMapping("api/v1/product-categories")
    public ProductCategoryDTO getByCategoryName(@RequestParam final String productCategoryName) {
        return productCategoryService.getByName(productCategoryName);
    }

    @PostMapping("api/v1/product-categories")
    private ProductCategoryDTO createCategory(@RequestBody ProductCategoryDTO productCategory) {
        return productCategoryService.createCategory(productCategory);
    }


}

