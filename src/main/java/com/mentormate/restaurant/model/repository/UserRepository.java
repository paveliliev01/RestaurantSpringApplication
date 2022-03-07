package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.dto.userDTO.UserRegisterDTO;
import com.mentormate.restaurant.model.dto.userDTO.UserResponseDTO;
import com.mentormate.restaurant.model.pojos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    @Query(value = "select * from users u where u.soft_delete=0", nativeQuery = true)
    List<User> findAll();

    List<User> findByUserName(String userName);

    Optional<User> findById(int userId);

    Optional<UserResponseDTO> save(UserRegisterDTO userRegisterDTO);

    Optional<User> getByUserEmail(String userEmail);

    Optional<User> getByUserName(String userName);

}

