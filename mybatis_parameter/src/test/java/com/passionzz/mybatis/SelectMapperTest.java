package com.passionzz.mybatis;

import com.passionzz.mybatis.mapper.SelectMapper;
import com.passionzz.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Classname SelectMapperTest
 * @Date 2022/9/9 19:03
 * @Created by passionzz
 * @Description
 */
public class SelectMapperTest {
    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> user = mapper.getUserByIdToMap(4);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testGetUserInMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> list = mapper.getUsersInMap();
        System.out.println(list);
        sqlSession.close();
    }
    @Test
    public void testGetUserToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> list = mapper.getUserToMap();
        System.out.println(list);
        sqlSession.close();
    }
}
