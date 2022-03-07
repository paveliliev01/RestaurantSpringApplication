package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.roleDTO.RoleDTO;
import com.mentormate.restaurant.model.pojos.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {

    public RoleDTO toDto(Role entity) {
        RoleDTO dto = new RoleDTO();
        dto.setRoleId(entity.getId());
        dto.setRoleName(entity.getRoleName());
        return dto;
    }

    public Role toEntity(RoleDTO dto) {
        Role entity = new Role();
        entity.setId(dto.getRoleId());
        entity.setRoleName(dto.getRoleName());

        return entity;
    }
}
