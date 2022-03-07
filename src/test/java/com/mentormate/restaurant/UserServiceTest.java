package com.mentormate.restaurant;

import com.mentormate.restaurant.model.dto.userDTO.UserRegisterDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.User;
import com.mentormate.restaurant.model.repository.UserRepository;
import com.mentormate.restaurant.model.service.converters.UserConverter;
import com.mentormate.restaurant.model.service.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Mock
    UserConverter userConverter;

    @Test
    public void getAllUsers() {
        User user = new User();
        user.setUserId(1);
        user.setUserEmail("test1");
        user.setUserName("Pavel");
        user.setPassword("123");


        User user2 = new User();
        user2.setUserId(1);
        user2.setUserEmail("test2");
        user2.setUserName("Pavel");
        user2.setPassword("123");


        User user3 = new User();
        user3.setUserId(1);
        user3.setUserEmail("test3");
        user3.setUserName("Pavel");
        user3.setPassword("123");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);
        userList.add(user3);

        List<UserResponseDTO> newList = new ArrayList<>();
        for (User u : userList) {
            newList.add(userConverter.toDto(u));
        }
    }

    @Test
    public void getUserById() {
        User user = new User();
        user.setUserId(1);
        user.setUserEmail("test3");
        user.setUserName("Pavel");
        user.setPassword("123");

        UserResponseDTO userDTO = userConverter.toDto(user);
        assertEquals(userDTO, userService.getById(1));
    }

    @Test
    public void getUserByName() {
        User user = new User();
        user.setUserId(1);
        user.setUserEmail("test3");
        user.setUserName("Pavel");
        user.setPassword("123");

        when(userRepository.getByUserName(user.getUserName())).thenReturn(Optional.of(user));
        UserResponseDTO userDTO = userConverter.toDto(user);
        assertEquals(userDTO, userService.getByName(user.getUserName()));
    }

    @Test
    public void createUser() {
        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
        userRegisterDTO.setUserEmail("test3");
        userRegisterDTO.setUserName("Pavel");
        userRegisterDTO.setPassword("123");

        User user = userConverter.toEntityFromRegister(userRegisterDTO);
        final User saved = userRepository.save(user);
        userConverter.toDto(saved);

    }

    @Test
    public void getUserByEmail() {
        User user = new User();
        user.setUserId(1);
        user.setUserEmail("test3");
        user.setUserName("Pavel");
        user.setPassword("123");

        when(userRepository.getByUserEmail(user.getUserEmail())).thenReturn(Optional.of(user));
        UserResponseDTO userDTO = userConverter.toDto(user);
        assertEquals(userDTO, userService.getByEmail(user.getUserEmail()));
    }

}
