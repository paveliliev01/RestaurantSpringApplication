package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.dto.userDTO.UserRegisterDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.service.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("api/v1/getAllUsers")
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("api/v1/users")
    public void createUser(@RequestBody UserRegisterDTO user) {
        userService.createUser(user);
    }

    @GetMapping("api/v1/users/{userId}")
    public List<UserResponseDTO> getUserById(@PathVariable final int userId) {
        return userService.getById(userId);
    }

    @GetMapping("api/v1/users/email")
    public UserResponseDTO getUserByEmail(@RequestParam final String email) {
        return userService.getByEmail(email);
    }

    @GetMapping("api/v1/users/name")
    public UserResponseDTO getUserByName(@RequestParam final String name) {
        return userService.getByName(name);
    }

//    @DeleteMapping("api/v1/users/{userId}")
//    public void deleteUserById(@PathVariable final int userId){
//        userService.deleteUserById(userId);
//    }

    @PostMapping("api/v1/users/UpdateEmail")
    public UserResponseDTO editUserEmail(Integer userId, String email) {
        return userService.editUserEmail(userId, email);
    }

    @PostMapping("api/v1/users/UpdateUserName")
    public UserResponseDTO editUserName(Integer userId, String userName) {
        return userService.editUserName(userId, userName);
    }

    @PostMapping("api/v1/users/updatePassword")
    public UserResponseDTO editPassword(Integer userId, String newPassword) {
        return userService.editPassword(userId, newPassword);
    }

    @GetMapping("api/v1/getUserByRoleId")
    public List<UserResponseDTO> getUsersByRoleId(@RequestParam final int roleId) {
        return userService.findUserByRoleId(roleId);
    }

    @DeleteMapping("api/v1/users/{userId}")
    public void softDeleteUser(@PathVariable final int userId) {
        userService.softDelete(userId);
    }
}
