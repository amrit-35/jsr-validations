package com.example.service;


import com.example.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    Long save(User user);

    boolean checkEmailIdAlreadyUsed(String email);
}
