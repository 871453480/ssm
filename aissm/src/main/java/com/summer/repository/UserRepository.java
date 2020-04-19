package com.summer.repository;

import com.summer.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
}
