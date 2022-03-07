package com.mentormate.restaurant.model.dto.userDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponseDTO {

    private int userId;
    private String userName;
    private String userEmail;


}
