package com.operation.cache.crud_cache.repository;

import com.operation.cache.crud_cache.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<User,Long> {
}
