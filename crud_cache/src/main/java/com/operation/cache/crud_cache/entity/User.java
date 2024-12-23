package com.operation.cache.crud_cache.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "USER_TABLE")
public class User implements Serializable {

    @Id
    @Column(name = "ID")
    private Long userId;

    @Column(name = "U_NAME")
    private String name;

    @Column(name = "USER_COUNTRY")
    private String userCountry;

    @Column(name = "USER_AGE")
    private int userAge;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
