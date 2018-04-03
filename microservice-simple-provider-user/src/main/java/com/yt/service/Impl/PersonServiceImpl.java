package com.yt.service.Impl;

import com.yt.mapper.PersonMapper;
import com.yt.mapper.TUserMapper;
import com.yt.service.PersonService;
import com.yt.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MrLee on 2018/1/18.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    public TUserMapper tUserMapper;

    @Autowired
    public PersonMapper personMapper;

    @Override
    public Person queryPersonById(String id) {
        return personMapper.selectByPrimaryKey(id);
    }
}
