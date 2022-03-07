package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.productDTO.ProductDTO;
import com.mentormate.restaurant.model.pojos.Product;
import com.mentormate.restaurant.model.repository.ProductRepository;
import com.mentormate.restaurant.model.service.converters.ProductConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    public ProductService(ProductRepository productRepository, ProductConverter productConverter) {
        this.productRepository = productRepository;
        this.productConverter = productConverter;
    }


    public List<ProductDTO> findAll(){
        List<Product> userList = productRepository.findAll();
        List<ProductDTO> newList = new ArrayList<>();
        for (Product p : userList) {
            newList.add(productConverter.toDto(p));
        }
        return newList;
    }

    public ProductDTO createProduct(ProductDTO productDTO){
        Product product = productConverter.toEntity(productDTO);
        final Product save = productRepository.save(product);
        return productConverter.toDto(product);
    }

    public ProductDTO findById(Integer id){
        return productConverter.toDto(productRepository.findById(id).get());
    }

    public void softDelete(Integer id) {
        Product product = productRepository.getById(id);
        product.setSoftDelete(1);
        Product saved = productRepository.save(product);


    }
}
