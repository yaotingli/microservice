package com.yt.service.Impl;

import com.yt.mapper.TUserMapper;
import com.yt.model.TUser;
import com.yt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MrLee on 2018/1/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public TUserMapper tUserMapper;

    @Override
    public TUser queryUserById(String id) {
        return tUserMapper.selectByPrimaryKey(id);
    }
}
