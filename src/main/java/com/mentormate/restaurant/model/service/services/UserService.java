package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.userDTO.UserRegisterDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.User;
import com.mentormate.restaurant.model.repository.RoleRepository;
import com.mentormate.restaurant.model.repository.UserRepository;
import com.mentormate.restaurant.model.service.converters.UserConverter;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;
    private final RoleRepository roleRepository;
    private final EntityManagerFactory emf;

    public UserService(UserRepository userRepository, UserConverter userConverter, RoleRepository roleRepository, EntityManagerFactory emf) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
        this.roleRepository = roleRepository;
        this.emf = emf;
    }

    public List<UserResponseDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
//        List<UserResponseDTO> userResponseDTOS = userList.stream()
//                .map(userConverter::toDto)
//                .collect(Collectors.toList());

        List<UserResponseDTO> newList = new ArrayList<>();
        for (User u : userList) {
            newList.add(userConverter.toDto(u));
        }
        return newList;
//        return userResponseDTOS;
    }

    public UserResponseDTO createUser(UserRegisterDTO userRegisterDTO) {
        final User user = userConverter.toEntityFromRegister(userRegisterDTO);
        if (roleRepository.findById(2).isPresent()) {
            user.addRole(roleRepository.findById(2).get());
        }
        final User saved = userRepository.save(user);
        return userConverter.toDto(saved);
    }

    public List<UserResponseDTO> getById(int userId) {
        if (userRepository.findById(userId).isEmpty()) {
            return getAllUsers();
        }
        List<UserResponseDTO> userResponseDTOS = new ArrayList<>();
        userResponseDTOS.add(userConverter.toDto(userRepository.getById(userId)));
        return userResponseDTOS;

    }

    public UserResponseDTO getByEmail(String userEmail) {
        return userConverter.toDto(userRepository.getByUserEmail(userEmail).get());
    }

    public UserResponseDTO getByName(String userName) {
        return userConverter.toDto(userRepository.getByUserName(userName).get());
    }

    public Map<String, Boolean> deleteUserById(Integer userId) {
        User user = userRepository.findById(userId).get();
        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;

    }

    public UserResponseDTO editUserEmail(Integer userId, String email) {
        User user = userRepository.findById(userId).get();
        user.setUserEmail(email);
        User editedUser = userRepository.save(user);
        return userConverter.toDto(editedUser);
    }

    public UserResponseDTO editUserName(Integer userId, String userName) {
        User user = userRepository.findById(userId).get();
        user.setUserName(userName);
        User editedUser = userRepository.save(user);
        return userConverter.toDto(editedUser);
    }

    public UserResponseDTO editPassword(Integer userId, String newPassword) {
        User user = userRepository.findById(userId).get();
        user.setPassword(newPassword);
        User editedUser = userRepository.save(user);
        return userConverter.toDto(editedUser);
    }

    public List<UserResponseDTO> findUserByRoleId(Integer roleId) {
        List<User> userList = userRepository.findAll();
//        List<UserResponseDTO> newList = new ArrayList<>();
//        for (User user : userList) {
//           if (user.getRoles().contains(roleRepository.getById(roleId))){
//               newList.add(userConverter.toDto(user));
//           }
//        }
        return userList.stream()
                .filter(u -> u.getRoles().contains(roleRepository.getById(roleId)))
                .map(userConverter::toDto)
                .collect(Collectors.toList());

    }

    public void softDelete(Integer id) {
        User user = userRepository.getById(id);
        user.setSoftDelete(1);
        User saved = userRepository.save(user);
    }

}
