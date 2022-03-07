package com.mentormate.restaurant.model.dto.userDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRegisterDTO {

    private String userName;
    private String userEmail;
    private String password;
    private int softDelete;
}
