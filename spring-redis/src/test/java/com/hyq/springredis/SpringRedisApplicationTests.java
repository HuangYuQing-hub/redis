package com.hyq.springredis;

import com.alibaba.cloud.spring.boot.redis.env.RedisProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringRedisApplicationTests {

    @Autowired
    private RedisProperties redisProperties;

    @Test
    void contextLoads() {
       String ins = redisProperties.getInstanceId();
       System.out.println("=====:"+ins+"==="+redisProperties.getDefaultRegionId());
    }

}
