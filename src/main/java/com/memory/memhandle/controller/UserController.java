package com.memory.memhandle.controller;

import com.memory.memhandle.models.StaticUsers;
import com.memory.memhandle.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/all")
    List<User> getUsers() {
        return Arrays.asList(
                new User("1001", "John", 29),
                new User("1002", "Kamal", 45),
                new User("1003", "Jenny", 30)
        );
    }

    @PostMapping("/non-static")
    String createUsers() {
        List<User> users = new ArrayList<>();

        for(int i = 0; i < 10000; i ++){
            users.add(new User());
        }

        return "USERS ADDED";
    }

    @PostMapping("/static")
    String createStaticUsers() {
        for(int i = 0; i < 100000; i ++){
            StaticUsers.setStaticUsers(new User());
        }

        return "STATIC USERS ADDED";
    }
}
