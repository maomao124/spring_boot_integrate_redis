package mao.spring_boot_integrate_redis;

import com.alibaba.fastjson.JSON;
import mao.spring_boot_integrate_redis.data.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Project name(项目名称)：spring_boot_integrate_redis
 * Package(包名): mao.spring_boot_integrate_redis
 * Class(类名): RedisObjectStringRedisTemplateTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/19
 * Time(创建时间)： 13:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@SpringBootTest
public class RedisObjectStringRedisTemplateTest
{
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void set()
    {
        User user = new User(477, "王五", "1250");
        String json = JSON.toJSONString(user);
        System.out.println(json);
        stringRedisTemplate.opsForValue().set("object3", json);
    }

    @Test
    void get()
    {
        String json = stringRedisTemplate.opsForValue().get("object3");
        System.out.println(json);
        User user = JSON.parseObject(json, User.class);
        System.out.println(user);
    }

    @Test
    void del()
    {
        Boolean delete = stringRedisTemplate.delete("object3");
        System.out.println(delete);
    }
}
