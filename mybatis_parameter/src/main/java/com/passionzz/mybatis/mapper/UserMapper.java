package com.passionzz.mybatis.mapper;

import com.passionzz.mybatis.POJO.User;
import org.apache.ibatis.annotations.Param;
import sun.java2d.pipe.ValidatePipe;

/**
 * @Classname UserMapper
 * @Date 2022/9/9 10:15
 * @Created by passionzz
 * @Description UserMapper接口类
 */
public interface UserMapper {

    /**
     * 通过用户名获取用户
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 根据用户名和密码检查登录
     * @param username
     * @param password
     * @return
     */
    User CheckLogin(String username, String password);

    /**
     * 插入实体User
     * @param user
     * @return
     */
    void insertUser(User user);

    /**
     * 通过注解自定义传入参数的key
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParams(@Param("username")String username, @Param("password")String password);
}
