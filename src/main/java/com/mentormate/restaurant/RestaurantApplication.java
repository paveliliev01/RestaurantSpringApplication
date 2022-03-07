package com.mentormate.restaurant;

import com.mentormate.restaurant.model.dto.productCategoryDTO.ProductCategoryDTO;
import com.mentormate.restaurant.model.pojos.ProductCategory;
import com.mentormate.restaurant.model.service.converters.ProductCategoryConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class RestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

}
