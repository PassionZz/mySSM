package com.passionzz.mapper;

import com.passionzz.POJO.User;

import java.util.List;

public interface UserMapper {
    /**
     * 插入用户信息
     * @return
     */
    int insertUser();

    /**
     * 更新用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 查询单个用户信息
     * @return
     */
    User getUserById();

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();
}
