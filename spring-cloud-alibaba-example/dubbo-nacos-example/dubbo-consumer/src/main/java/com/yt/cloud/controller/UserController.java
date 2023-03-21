package com.yt.cloud.controller;

import com.yt.cloud.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference(check = false)
    private UserService userService;

    @GetMapping("/getUser")
    public String getUserName() {

        return userService.getUser("1").getUserName();
    }
}
