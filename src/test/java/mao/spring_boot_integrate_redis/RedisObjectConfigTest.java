package mao.spring_boot_integrate_redis;

import mao.spring_boot_integrate_redis.data.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Project name(项目名称)：spring_boot_integrate_redis
 * Package(包名): mao.spring_boot_integrate_redis
 * Class(类名): RedisObjectConfigTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/19
 * Time(创建时间)： 12:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@SpringBootTest
public class RedisObjectConfigTest
{
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Test
    void set()
    {
        User user = new User(56, "李四", "1254");
        redisTemplate.opsForValue().set("object2", user);
    }

    @Test
    void get()
    {
        Object o = redisTemplate.opsForValue().get("object2");
        User user = (User) o;
        System.out.println(user);
    }

    @Test
    void del()
    {
        Boolean delete = redisTemplate.delete("object2");
        System.out.println(delete);
    }
}
