package com.dce.auth.service;

import java.util.List;

import com.dce.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
    List<User> listAllUsers();
}
