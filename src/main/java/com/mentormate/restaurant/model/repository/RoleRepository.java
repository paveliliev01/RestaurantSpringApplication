package com.mentormate.restaurant.model.repository;

import com.mentormate.restaurant.model.pojos.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    List<Role> findAll();

    Optional<Role> findByRoleName(String roleName);

    Optional<Role> findById(int roleId);

}
