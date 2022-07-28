package com.divyakant.userservice.controller;

import com.divyakant.userservice.dto.ResponseTemplate;
import com.divyakant.userservice.entity.User;
import com.divyakant.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id)
    {
        return userService.findByUserId(id);
    }

    @GetMapping("/details/{id}")
    public ResponseTemplate getuserDetails(@PathVariable Long id)
    {
        return userService.getUserDetails(id);
    }
}
