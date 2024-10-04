package com.javaweb.springbootnyano.controller.user;

import com.javaweb.springbootnyano.entity.user.UserEntity;
import com.javaweb.springbootnyano.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserCRUDController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add")
    public UserEntity addUser(@RequestBody UserEntity userEntity) {
        System.out.println(5 / 0);
        return userService.createUser(userEntity);
    }

    @GetMapping(value = "/search")
    public UserEntity searchUser(@RequestParam(value = "userName1", required = false) String userName1, @RequestParam(value = "email", required = false) String email) {

        return userService.showUserNameAndUserEmail(userName1, email);
    }


}
