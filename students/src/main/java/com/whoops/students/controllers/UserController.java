package com.whoops.students.controllers;
import java.util.ArrayList;
import java.util.List;

import com.whoops.students.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    List<User> listOfUsers = new ArrayList<>();

    @GetMapping("/")
    public List<User> getUser() {
        return listOfUsers;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return listOfUsers.get(Math.toIntExact(userId));
    }

}

