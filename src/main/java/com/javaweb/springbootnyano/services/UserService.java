package com.javaweb.springbootnyano.services;

import com.javaweb.springbootnyano.entity.user.UserEntity;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    UserEntity createUser(UserEntity user);

    UserEntity showUserNameAndUserEmail(String userName, String userEmail);
//    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
}
