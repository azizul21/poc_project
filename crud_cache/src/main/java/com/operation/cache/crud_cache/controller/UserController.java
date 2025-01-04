package com.operation.cache.crud_cache.controller;

import com.operation.cache.crud_cache.entity.User;
import com.operation.cache.crud_cache.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag( name = "User-Crud-Operation",
        description = "Create, Read, Update, Delete API"
)
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @Operation(summary = "Get All User",description = "Return All User's Data")
    @GetMapping("/users")
    public List<User> getAllUser(){
        return this.userService.getAllUser();
    }

    @Operation(summary = "Get User By UserId",description = "Return Single User's Data")
    @GetMapping("/user/{Id}")
    public User getUserById(@PathVariable Long Id){
        return this.userService.getUserById(Id);
    }

    @Operation(summary = "Create New User",description = "Create Single User's Data")
    @PostMapping("/user/add")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @Operation(summary = "Delete User By UserId",description = "Delete Single User's Data")
    @DeleteMapping("/user/{Id}")
    public void deleteUserById(@PathVariable Long Id){
        this.userService.deleteUserById(Id);
    }

    @Operation(summary = "Update User by UserId",description = "Update Single User's Data")
    @PutMapping("/user/update")
    public User updateUserById(@RequestBody User user){
        return this.userService.updateUserById(user);
    }


}
