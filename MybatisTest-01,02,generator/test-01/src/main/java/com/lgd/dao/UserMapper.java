package com.lgd.dao;

import com.lgd.pojo.User;

import java.util.HashMap;
import java.util.List;

/**
 * @author LGD
 */
public interface UserMapper {
    /**
     * ��������û�
     * @param
     * @return com.lgd.pojo.User
     */
    List<User> getUserList();

    /**
     * ���ָ��Id�û�
     * @return User
     */
    User getUserById(int id);

    /**
     * ���ָ��Id�û�b
     * @return User
     */
    User getUserById2(HashMap map);

    /**
     * create by: LGD
     * description: ģ����ѯ
     * create time: 2021/10/10 13:27
     *
     * @return List<User>
     * @Param: map     */
    List<User> getUserLike(HashMap map);

    /**
     * �����û�
     * @param user
     * @return int
     */
    int addUser(User user);

    /**
     * ��������û�
     * @param map
     * @return int
     */
    int addUser2(HashMap map);

    /**
     * ��������û�
     * @param   user
     * @return int
     */
    int updateUser(User user);

    /**
     * ��������û�
     * @param id
     * @return int
     */
    int deleteUser(int id);
}
