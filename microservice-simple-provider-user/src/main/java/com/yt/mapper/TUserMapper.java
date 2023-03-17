package com.yt.mapper;

import com.yt.model.TUser;

public interface TUserMapper extends BaseMapper<TUser> {

    /**
     * 根据Id查询User
     *
     * @param id
     * @return
     */
    TUser selectByPrimaryKey(String id);
}