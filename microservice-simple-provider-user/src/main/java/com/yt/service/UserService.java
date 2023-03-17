package com.yt.service;

import com.yt.model.Person;
import com.yt.model.TUser;

/**
 * Created by MrLee on 2018/1/18.
 */
public interface UserService {
    TUser queryUserById(String id);
}
