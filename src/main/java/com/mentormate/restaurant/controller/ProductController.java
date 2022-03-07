package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.dto.productDTO.ProductDTO;
import com.mentormate.restaurant.model.service.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("api/v1/products")
    public ProductDTO findById() {
        return productService.findById(1);
    }

    @GetMapping("api/v1/allProducts")
    public List<ProductDTO> findAll() {
        return productService.findAll();
    }

    @PostMapping("api/v1/products")
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }

    @PostMapping("api/v1/products/delete")
    public void softDeleteProduct(@RequestParam final int productId) {
        productService.softDelete(productId);
    }
}
