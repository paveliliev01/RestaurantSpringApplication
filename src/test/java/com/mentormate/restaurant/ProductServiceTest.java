package com.mentormate.restaurant;

import com.mentormate.restaurant.model.dto.productDTO.ProductDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.Product;
import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.repository.ProductRepository;
import com.mentormate.restaurant.model.service.converters.OrderConverter;
import com.mentormate.restaurant.model.service.converters.ProductConverter;
import com.mentormate.restaurant.model.service.services.OrderService;
import com.mentormate.restaurant.model.service.services.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @InjectMocks
    ProductService productService;

    @Mock
    ProductRepository productRepository;

    @Mock
    ProductConverter productConverter;

    @Test
    public void test(){
        ModelMapper modelMapper = new ModelMapper();
        Product productDTO = new Product();
        productDTO.setProductPrice(11.1);
        productDTO.setProductId(1);
        productDTO.setProductCategory("Meat");
        productDTO.setProductName("Meat");
        productDTO.setDescription("Test");
        ProductDTO productDTO1 = new ProductDTO();
        modelMapper.map(productDTO,productDTO1);
        System.out.println(productDTO1.getProductName());




    }

}