package com.yt.cloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

@RestController
public class ProviderController {

    /**
     * 为客户端提供可调用的接口
     */
    @RequestMapping("/call/{name}")
    public String call(@PathVariable String name){
        return LocalTime.now() + "——服务提供者1：" + name;
    }

    /**
     * 为客户端提供可调用的接口
     */
    @RequestMapping("/callWithTimeout/{name}")
    public String callWithTimeout(@PathVariable String name) throws InterruptedException {
        // 让程序休眠 2s
        TimeUnit.SECONDS.sleep(2);
        return LocalTime.now() + "——服务提供者1：" + name;
    }
}
