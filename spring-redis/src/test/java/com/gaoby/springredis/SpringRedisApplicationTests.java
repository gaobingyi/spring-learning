package com.gaoby.springredis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class SpringRedisApplicationTests {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void testStringRedisTemplate() {
        stringRedisTemplate.opsForValue().set("name", "gaoby");
        String name = stringRedisTemplate.opsForValue().get("name");
        Assertions.assertThat(name).isEqualTo("gaoby");
    }

    @Test
    void testRedisTemplate() {
        redisTemplate.opsForValue().set("name", "gaoby");
        String name = (String) redisTemplate.opsForValue().get("name");
        Assertions.assertThat(name).isEqualTo("gaoby");

        redisTemplate.opsForValue().set("user", new User("gaoby", 20));
        User user = (User) redisTemplate.opsForValue().get("user");
        Assertions.assertThat(user).isNotNull();
        Assertions.assertThat(user.getName()).isEqualTo("gaoby");
        Assertions.assertThat(user.getAge()).isEqualTo(20);
    }

}
