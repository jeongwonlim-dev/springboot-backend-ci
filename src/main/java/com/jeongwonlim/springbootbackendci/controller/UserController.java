package com.jeongwonlim.springbootbackendci.controller;

import com.jeongwonlim.springbootbackendci.model.User;
import com.jeongwonlim.springbootbackendci.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    // 생성자 주입
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET /users
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
