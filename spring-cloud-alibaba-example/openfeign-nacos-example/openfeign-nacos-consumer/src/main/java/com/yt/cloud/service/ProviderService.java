package com.yt.cloud.service;

import com.yt.cloud.service.fallback.ProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "openfeign-provider", fallback = ProviderServiceFallback.class)
public interface ProviderService {

    @RequestMapping("/call/{name}")
    public String call(@PathVariable(value = "name") String name);

    @RequestMapping("/callWithTimeout/{name}")
    public String callWithTimeout(@PathVariable(value = "name") String name);
}
