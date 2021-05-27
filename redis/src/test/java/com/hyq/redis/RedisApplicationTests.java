package com.hyq.redis;

import com.hyq.pojo.Door;
import com.hyq.service.IDoorService;
import com.hyq.service.impl.DoorServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {

        //1. 操作简单KV
        stringRedisTemplate.opsForValue().set("name","ToTestRedis");
        String nameValue = stringRedisTemplate.opsForValue().get("name");
        System.out.println("--====--:"+nameValue);

        //2. 操作Hash表
        stringRedisTemplate.opsForHash().put("config","host","127.0.0.1");
        stringRedisTemplate.opsForHash().put("config","port","6379");
        String port = stringRedisTemplate.opsForHash().get("config","port").toString();
        System.out.println("--====--:"+port);

        //3. 操作List
        stringRedisTemplate.opsForList().rightPush("redisConfig","host-127.0.0.1");
        System.out.println("--====--:"+stringRedisTemplate.opsForList().leftPop("redisConfig"));





    }

    @Test
    public void testBatchUp(){
        List<Door> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            Door door =  Door.builder().id(i).flag(3).build();
            list.add(door);
        }

        IDoorService doorService = new DoorServiceImpl();
        doorService.batchUp(list);
    }
}
