package mao.spring_boot_integrate_redis.data;

import java.io.Serializable;

/**
 * Project name(项目名称)：spring_boot_integrate_redis
 * Package(包名): mao.spring_boot_integrate_redis.data
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/19
 * Time(创建时间)： 12:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class User implements Serializable
{
    private int id;
    private String username;
    private String password;

    public User()
    {

    }

    public User(int id, String username, String password)
    {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("username：").append(username).append('\n');
        stringbuilder.append("password：").append(password).append('\n');
        return stringbuilder.toString();
    }
}
