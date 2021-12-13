package com.lgd.mapper;

import com.lgd.pojo.Student;
import com.lgd.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
//    @Select("select * from teacher where id = #{id}")
    public Teacher getTeacherById(@Param("id") int id);

    Teacher getTeacherStudents(@Param("tid")int id);

    Teacher getTeacherStudents2(@Param("tid")int id);
}
