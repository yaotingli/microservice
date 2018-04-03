package com.yt.web;

import com.yt.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MrLee on 2018/1/22.
 */
@RestController
public class MovieController {

    @Value("user.userServiceUrl")
    private String userServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public Person findById(@PathVariable String id){
        return this.restTemplate.getForObject(userServiceUrl + id, Person.class);
    }
}
