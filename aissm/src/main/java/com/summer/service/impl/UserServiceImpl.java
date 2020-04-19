package com.summer.service.impl;


import com.summer.entity.User;
import com.summer.repository.UserRepository;
import com.summer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return  userRepository.findAll();
    }

    }
