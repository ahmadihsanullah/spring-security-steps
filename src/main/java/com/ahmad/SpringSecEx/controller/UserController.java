package com.ahmad.SpringSecEx.controller;

import com.ahmad.SpringSecEx.model.User;
import com.ahmad.SpringSecEx.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;

    List<User> data = new ArrayList<>(List.of(
            new User(1, "ahmad", "rahasia"),
            new User(2, "hanif", "jagoan")
    ));

    @GetMapping("users")
    public List<User> penggunas(HttpServletRequest request){
        return userService.findAllUsers();
    }

    @PostMapping("register")
    public User save(@RequestBody User user){
       return userService.register(user);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
