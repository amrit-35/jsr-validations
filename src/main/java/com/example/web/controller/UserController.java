package com.example.web.controller;


import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.web.resource.UserResource;
import org.mapstruct.factory.Mappers;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public Long addUser(@RequestBody @Validated UserResource userResource) {
        User user = UserMapper.INSTANCE.toUser(userResource);
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

}
