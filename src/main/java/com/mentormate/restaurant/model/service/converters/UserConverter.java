package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.userDTO.UserRegisterDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    private final ModelMapper modelMapper = new ModelMapper();


    public UserResponseDTO toDto(User entity) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setUserId(entity.getUserId());
        dto.setUserName(entity.getUserName());
        dto.setUserEmail(entity.getUserEmail());
        return dto;
    }

    public User toEntity(UserResponseDTO dto) {
        User entity = new User();
        entity.setUserId(dto.getUserId());
        entity.setUserName(dto.getUserName());
        entity.setUserEmail(dto.getUserEmail());

        return entity;
    }


    public User toEntityFromRegister(UserRegisterDTO dto) {
        User entity = new User();
        entity.setUserName(dto.getUserName());
        entity.setUserEmail(dto.getUserEmail());
        entity.setPassword(dto.getPassword());
        entity.setSoftDelete(dto.getSoftDelete());
        return entity;
    }

}
