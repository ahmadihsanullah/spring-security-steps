package com.ahmad.SpringSecEx.controller;

import com.ahmad.SpringSecEx.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    List<User> data = new ArrayList<>(List.of(
            new User(1, "ahmad", "rahasia"),
            new User(2, "hanif", "jagoan")
    ));

    @GetMapping("user")
    public List<User> penggunas(HttpServletRequest request){
        return data;
    }

    @PostMapping("user")
    public List<User> pengguna(@RequestBody User user){
        data.add(user);
        return data;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
