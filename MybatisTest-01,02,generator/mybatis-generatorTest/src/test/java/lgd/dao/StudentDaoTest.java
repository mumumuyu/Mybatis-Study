package lgd.dao;

import com.lgd.dao.StudentMapper;
import com.lgd.pojo.Student;
import com.lgd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectByPrimaryKey("001");
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public void addUsertest(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int student = studentMapper.insert(new Student("004","lgd","男"));
        if (student>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUsertest(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int student = studentMapper.insertSelective(new Student("004","lgd"));
        if (student>0){
            System.out.println("更新成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
//    @Test
//    public void deleteUsertest(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        int user = userMapper.deleteUser(5);
//        if (user>0){
//            System.out.println("删除成功");
//        }
//        sqlSession.commit();
//        sqlSession.close();
//    }
}
