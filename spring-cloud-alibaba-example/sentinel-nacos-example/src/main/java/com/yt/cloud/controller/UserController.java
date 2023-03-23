package com.yt.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String name() {
        return "name";
    }

    @GetMapping("/hello")
    /**
     *  限流与阻塞处理
     *     通过@SentinelResource注解的blockHandler属性制定具体的处理函数
     *     实现处理函数，该函数的传参必须与资源点的传参一样，并且最后加上BlockException异常参数；同时，返回类型也必须一样
     */
    @SentinelResource(value = "hello", blockHandler = "handleException")
    public String hello() {
        return "hello, this is user service";
    }

    /**
     * 自定义流控异常信息
     *
     * @param e
     * @return
     */
    public String handleException(BlockException e) {
        return "你已被流控" + e;
    }

    @GetMapping("/hello2")
    // 熔断与降级处理
    @SentinelResource(value = "hello2", fallback = "handleFallbackException")
    public String hello2() {
        return "hello2, this is user service";
    }

    /**
     * 自定义流控异常信息
     *
     * @param e
     * @return
     */
    public String handleFallbackException(BlockException e) {
        return "你已被降级了" + e;
    }
}
