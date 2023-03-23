package com.yt.cloud.service.fallback;

import com.yt.cloud.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceFallback implements ProviderService {
    @Override
    public String call(String name) {
        return "error call";
    }

    @Override
    public String callWithTimeout(String name) {
        return "error callWithTimeout";
    }
}
