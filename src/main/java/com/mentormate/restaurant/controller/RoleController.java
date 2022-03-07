package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.dto.roleDTO.RoleDTO;
import com.mentormate.restaurant.model.service.services.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("api/v1/roles/allRoles")
    public List<RoleDTO> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("api/v1/roles/{roleId}")
    public List<RoleDTO> getById(@PathVariable final int roleId) {
        return roleService.getById(roleId);
    }

    @GetMapping("api/v1/roles")
    public RoleDTO getByName(@RequestParam final String roleName) {
        return roleService.getByName(roleName);
    }


}
