package com.operation.cache.crud_cache.service;

import com.operation.cache.crud_cache.entity.User;
import com.operation.cache.crud_cache.repository.UserInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.Optional;

import static org.mockito.Mockito.when;


public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserInterface userInterface;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getUserByIdTest(){
        when(userInterface.findById(1L)).thenReturn(Optional.of(new User(1L, "Aziz", "India", 33)));
        Optional<User> user =  this.userInterface.findById(1L);
        User user1 = user.orElse(null);
        Assertions.assertEquals("India",user1.getUserCountry());
    }


}
