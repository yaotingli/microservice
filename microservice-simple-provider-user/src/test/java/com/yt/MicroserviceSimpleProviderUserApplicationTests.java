package com.yt;

import com.yt.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceSimpleProviderUserApplicationTests {

	@Autowired
	PersonService personService;

	@Test
	public void contextLoads() {
		System.out.println("查询到数据为：" + personService.queryPersonById("101"));
	}

}
