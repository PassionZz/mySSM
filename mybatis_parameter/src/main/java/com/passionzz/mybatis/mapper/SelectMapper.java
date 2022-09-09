package com.passionzz.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Classname SelectMapper
 * @Date 2022/9/9 18:58
 * @Created by passionzz
 * @Description
 */
public interface SelectMapper {
    /**
     * 将单个用户放入map集合
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id")Integer id);

    /**
     * 每个user为一个map，所有user集合为List
     * @return
     */
    List<Map<String,Object>> getUsersInMap();

    /**
     * 嵌套map存储user，以id为键
     * @return
     */
    @MapKey("id")
    Map<String, Object> getUserToMap();
}
