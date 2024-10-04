package com.javaweb.springbootnyano.services.impl;

import com.javaweb.springbootnyano.entity.user.UserEntity;
import com.javaweb.springbootnyano.repository.UserRepository;
import com.javaweb.springbootnyano.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity showUserNameAndUserEmail(String userName, String userEmail) {
        return
                userRepository.findByUserNameAndUserEmail(userName, userEmail);


    }

}
