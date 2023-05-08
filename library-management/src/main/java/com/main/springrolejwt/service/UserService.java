package com.main.springrolejwt.service;

import java.util.List;

import com.main.springrolejwt.model.User;
import com.main.springrolejwt.model.UserDto;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
