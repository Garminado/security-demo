package com.example.securitydemo.controller;

import com.example.securitydemo.common.RespData;
import com.example.securitydemo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujiaming
 * @since 2024-07-25
 */
@RestController
public class LoginController {

    @PostMapping("/login")
    public RespData<User> login(@RequestBody User user) {

        return RespData.success(null);
    }
}
