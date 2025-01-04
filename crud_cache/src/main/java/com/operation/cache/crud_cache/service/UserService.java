package com.operation.cache.crud_cache.service;

import com.operation.cache.crud_cache.entity.User;
import com.operation.cache.crud_cache.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserInterface userInterface;

    //GetUsers
    @Cacheable("user")
    public List<User> getAllUser(){
        return this.userInterface.findAll();
    }

    //GetUserById
    @Cacheable(value = "user",key = "#Id")
    public User getUserById(Long Id){
        Optional<User> user =  this.userInterface.findById(Id);
        return user.orElse(new User(10L,"Sana","India",25));
    }


    //AddUSer
    @CachePut(value = "user",key = "#user.userId")
    public User addUser(User user){
        return this.userInterface.save(user);
    }


    //DeleteUserById
    @CacheEvict(value = "user",allEntries = true)
    public void deleteUserById(Long Id){
        this.userInterface.deleteById(Id);
    }


    //UpdateUserById
    @CachePut(value = "user",key = "#user.userId")
    public User updateUserById(User user){
        User user1 = this.getUserById(user.getUserId());
        user1.setUserId(user.getUserId());
        user1.setName(user.getName());
        user1.setUserCountry(user.getUserCountry());
        user1.setUserAge(user.getUserAge());
        return this.userInterface.save(user1);
    }

}
