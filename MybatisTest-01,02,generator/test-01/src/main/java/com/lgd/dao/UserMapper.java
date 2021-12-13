package com.lgd.dao;

import com.lgd.pojo.User;

import java.util.HashMap;
import java.util.List;

/**
 * @author LGD
 */
public interface UserMapper {
    /**
     * 获得所有用户
     * @param
     * @return com.lgd.pojo.User
     */
    List<User> getUserList();

    /**
     * 获得指定Id用户
     * @return User
     */
    User getUserById(int id);

    /**
     * 获得指定Id用户b
     * @return User
     */
    User getUserById2(HashMap map);

    /**
     * create by: LGD
     * description: 模糊查询
     * create time: 2021/10/10 13:27
     *
     * @return List<User>
     * @Param: map     */
    List<User> getUserLike(HashMap map);

    /**
     * 增加用户
     * @param user
     * @return int
     */
    int addUser(User user);

    /**
     * 获得所有用户
     * @param map
     * @return int
     */
    int addUser2(HashMap map);

    /**
     * 获得所有用户
     * @param   user
     * @return int
     */
    int updateUser(User user);

    /**
     * 获得所有用户
     * @param id
     * @return int
     */
    int deleteUser(int id);
}
