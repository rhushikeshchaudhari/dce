package com.dce.service;

import java.util.List;

import com.dce.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
    List<User> listAllUsers();
}
