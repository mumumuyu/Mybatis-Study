package com.lgd.dao;

import com.lgd.pojo.Student;

public interface StudentMapper {
    /**
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}