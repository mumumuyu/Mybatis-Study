import com.lgd.mapper.StudentMapper;
import com.lgd.mapper.TeacherMapper;
import com.lgd.pojo.Student;
import com.lgd.pojo.Teacher;
import com.lgd.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MyTest {
    @Test
    public void Ttest(){
        TeacherMapper mapper = MybatisUtils.getSqlSession().getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById(1);
        System.out.println(teacher);
    }

    @Test
    public void Stest(){
        StudentMapper mapper = MybatisUtils.getSqlSession().getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent2();
        for (Student s:students)
            System.out.println(s);
    }
//1057
    @Test
    public void TStest(){
        TeacherMapper mapper = MybatisUtils.getSqlSession().getMapper(TeacherMapper.class);
        long start=System.currentTimeMillis();
        Teacher teacher = mapper.getTeacherStudents2(1);
        long end=System.currentTimeMillis();
        System.out.println(teacher);
        System.out.println("用时"+(end-start));
    }
//1340
    @Test
    public void TStest2(){
        TeacherMapper mapper = MybatisUtils.getSqlSession().getMapper(TeacherMapper.class);
        long start2=System.currentTimeMillis();
        Teacher teacher2 = mapper.getTeacherStudents(1);
        long end2=System.currentTimeMillis();
        System.out.println(teacher2);
        System.out.println("用时"+(end2-start2));
    }
}
