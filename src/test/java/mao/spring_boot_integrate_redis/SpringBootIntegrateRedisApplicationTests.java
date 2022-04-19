package mao.spring_boot_integrate_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringBootIntegrateRedisApplicationTests
{

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
    void contextLoads()
    {
        redisTemplate.opsForValue().set("key11", "hello");
    }

    @Test
    void get()
    {
        String s = redisTemplate.opsForValue().get("key11");
        System.out.println(s);
    }

    @Test
    void del()
    {
        Boolean key11 = redisTemplate.delete("key11");
        System.out.println(key11);
    }
}
