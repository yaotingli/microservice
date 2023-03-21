package com.yt.cloud.api;

import com.yt.cloud.dto.User;

/**
 * 让生产者和服务消
 * 费者来使用这个接口
 */
public interface UserService {

    User getUser(String userId);
}
