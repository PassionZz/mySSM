package com.passionzz.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname SqlSessionUtil
 * @Date 2022/9/2 11:00
 * @Created by passionzz
 * @Description 用于获取session的工具类
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        SqlSession session = null;
        try {
//            获取配置文件的输入流
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//            工厂创建者
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//            创建工厂
            SqlSessionFactory factory = builder.build(is);
//            使用工厂获取对应Session
            session = factory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }
}
