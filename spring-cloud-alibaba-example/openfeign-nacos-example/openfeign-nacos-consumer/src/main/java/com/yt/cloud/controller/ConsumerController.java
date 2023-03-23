package com.yt.cloud.controller;

import com.yt.cloud.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private ProviderService providerService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private final String URL = "http://openfeign-provider";

    @GetMapping("/consumer")
    public String consumer(@RequestParam String name) {
        // 向调用本地方法一样，调用 openfeign client 中的方法
        return providerService.call(name);
    }

    @GetMapping("/consumerWithTimeout")
    public String consumerWithTimeout(@RequestParam String name) {
        // 向调用本地方法一样，调用 openfeign client 中的方法
        return providerService.callWithTimeout(name);
    }

    @GetMapping("/consumer/restTemplate")
    public String consumerWithRestTemplate(@RequestParam String name) {
        return restTemplate.getForObject(URL + "/call/" + name, String.class);
    }

    /**
     * 负载均衡器的核心类为LoadBalancerClient
     * @return
     */
    @GetMapping( value = "/consumer/LoadBalancerClient")
    public String loadBalancerClient()
    {
        //通过的负载均衡接口获取服务实例信息
        ServiceInstance serviceInstance = loadBalancerClient.choose("openfeign-provider");
        //直接写url也可以 http://openfeign-provider/call/1`
        String url = "http://" + serviceInstance.getServiceId() + ":" + serviceInstance.getPort() + "/call/test`";
        String result = restTemplate.getForObject(url, String.class);
        return  "【RestTemplate】" + result;
    }
}
