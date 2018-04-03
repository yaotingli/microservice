package com.yt.web;

import com.yt.model.Person;
import com.yt.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MrLee on 2018/1/18.
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public PersonService personService;

    @RequestMapping("/{id}")
    @ResponseBody
    public Person user(@PathVariable String id){
        logger.info("id is :" + id);
        return personService.queryPersonById(id);
    }
}
