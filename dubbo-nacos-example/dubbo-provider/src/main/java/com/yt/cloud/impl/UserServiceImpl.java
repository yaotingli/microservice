package com.yt.cloud.impl;


import com.yt.cloud.api.UserService;
import com.yt.cloud.dto.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String userId) {
        User user = new User();
        user.setUserId("1");
        user.setUserName("li");
        user.setAge(33);
        return user;
    }
}
