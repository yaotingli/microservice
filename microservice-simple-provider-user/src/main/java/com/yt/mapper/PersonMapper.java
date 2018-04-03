package com.yt.mapper;

import com.yt.model.Person;

public interface PersonMapper extends BaseMapper<Person> {
    /**
     * 根据Id查询Person
     * @param id
     * @return
     */
    Person selectByPrimaryKey(String id);
}