package com.dce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
