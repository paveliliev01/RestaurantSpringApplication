package com.mentormate.restaurant;

import com.mentormate.restaurant.model.dto.productCategoryDTO.ProductCategoryDTO;
import com.mentormate.restaurant.model.pojos.ProductCategory;
import com.mentormate.restaurant.model.repository.ProductCategoryRepository;
import com.mentormate.restaurant.model.service.converters.ProductCategoryConverter;
import com.mentormate.restaurant.model.service.services.ProductCategoryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProductCategoryServiceTest {
    @InjectMocks
    ProductCategoryService productCategoryService;

    @Mock
    ProductCategoryRepository productCategoryRepository;

    @Mock
    ProductCategoryConverter productCategoryConverter;

    @Test
    public void getAll() {
        ProductCategory p = new ProductCategory();
        p.setId(1);
        p.setCategoryName("test1");


        ProductCategory p2 = new ProductCategory();
        p2.setId(2);
        p2.setCategoryName("test2");

        List<ProductCategory> listCat = new ArrayList<>();
        listCat.add(p);
        listCat.add(p2);


        List<ProductCategoryDTO> newList = new ArrayList<>();
        for (ProductCategory productCategory : listCat) {
            newList.add(productCategoryConverter.toDto(productCategory));
        }
    }

    @Test
    public void getById() {
        ProductCategoryConverter productCategoryConverter = new ProductCategoryConverter();
        ProductCategory p = new ProductCategory();
        p.setId(1);
        p.setCategoryName("Test");

        ProductCategoryDTO p2 = productCategoryConverter.toDto(p);

    }

    @Test
    public void getByCategoryName() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setId(1);
        productCategory.setCategoryName("test1");

        ProductCategoryDTO productCategoryDTO = productCategoryConverter.toDto(productCategory);


    }

}
