package com.operation.cache.crud_cache.controller;

import com.operation.cache.crud_cache.entity.User;
import com.operation.cache.crud_cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getAllUser(){
        return this.userService.getAllUser();
    }

    @GetMapping("/user/{Id}")
    public User getUserById(@PathVariable Long Id){
        return this.userService.getUserById(Id);
    }


    @PostMapping("/user/add")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }


    @DeleteMapping("/user/{Id}")
    public void deleteUserById(@PathVariable Long Id){
        this.userService.deleteUserById(Id);
    }


    @PutMapping("/user/update")
    public User updateUserById(@RequestBody User user){
        return this.userService.updateUserById(user);
    }


}
