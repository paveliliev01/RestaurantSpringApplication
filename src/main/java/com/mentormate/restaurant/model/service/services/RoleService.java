package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.roleDTO.RoleDTO;
import com.mentormate.restaurant.model.pojos.Role;
import com.mentormate.restaurant.model.repository.RoleRepository;
import com.mentormate.restaurant.model.service.converters.RoleConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {

    private final RoleRepository roleRepository;
    private final RoleConverter roleConverter;

    public RoleService(RoleRepository roleRepository, RoleConverter roleConverter) {
        this.roleRepository = roleRepository;
        this.roleConverter = roleConverter;
    }

    public List<RoleDTO> getAllRoles(){
        List<Role> roleList = roleRepository.findAll();
        List<RoleDTO> roleDTOStream = roleList.stream().map(roleConverter::toDto).collect(Collectors.toList());
        return roleDTOStream;
    }

    public List<RoleDTO> getById(int roleId){
        List<RoleDTO> roles = new ArrayList<>();
        if (roleRepository.findById(roleId).isEmpty()){
            return getAllRoles();
        }
        roles.add(roleConverter.toDto(roleRepository.findById(roleId).get()));

        return roles;
    }

    public RoleDTO getByName(String roleName){
        return roleConverter.toDto(roleRepository.findByRoleName(roleName).get());
    }

}
