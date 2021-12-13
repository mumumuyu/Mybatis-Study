package com.lgd.dao;

import com.lgd.pojo.User;
import com.lgd.utils.MybatisUtils;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//
//import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserByIdtest(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void getUserByIdtest2(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap map = new HashMap();
        map.put("userId",2);
        User user = userMapper.getUserById2(map);
        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void getUserLiketest(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap map = new HashMap();
        map.put("userName","lg");
        List<User> userList = userMapper.getUserLike(map);

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
    @Test
    public void addUsertest(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int user = userMapper.addUser(new User(5,"lgd","123456"));
        if (user>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addUser2test(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        HashMap map = new HashMap();
        map.put("userId",5);
        map.put("userName","lgd");
        map.put("userPwd","1234567");
        int user = userMapper.addUser2(map);
        if (user>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUsertest(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int user = userMapper.updateUser(new User(4,"dls","654321"));
        if (user>0){
            System.out.println("更新成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUsertest(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int user = userMapper.deleteUser(5);
        if (user>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
