package com.mentormate.restaurant.model.dto.productDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {

    private String productCategory;
    private String productName;
    private String description;
    private Double productPrice;

}
