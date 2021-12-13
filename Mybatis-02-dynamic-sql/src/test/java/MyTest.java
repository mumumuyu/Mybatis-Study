import com.lgd.mapper.BlogMapper;
import com.lgd.pojo.Blog;
import com.lgd.utils.IdUtils;
import com.lgd.utils.MybatisUtils;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    @Test
    public void addTest(){
        BlogMapper mapper = MybatisUtils.getSqlSession().getMapper(BlogMapper.class);
        Timestamp timeStamp = new Timestamp(new Date().getTime());
        Blog blog = new Blog(IdUtils.getId(), "测试12", "lgd", timeStamp, 3);
        int num =0;
        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            blog.setId(IdUtils.getId());
            blog.setTitle("测试" + String.valueOf(i));
            num += mapper.addBlog(blog);
        }
        long end = System.currentTimeMillis();
        System.out.println(num + " " + (end-start));//10000条数据30秒
    }

    @Test
    public void SIFTest(){
        BlogMapper mapper = MybatisUtils.getSqlSession().getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("title","测试1");
//        map.put("views",3);
        List<Blog> blogs = mapper.getBlogIF(map);
        for (Blog blog:blogs)
            System.out.println(blog);
    }

    @Test
    public void SChooseTest(){
        BlogMapper mapper = MybatisUtils.getSqlSession().getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","测试1");
//        map.put("views",3);
        List<Blog> blogs = mapper.getBlogChoose(map);
        for (Blog blog:blogs)
            System.out.println(blog);
    }

    @Test
    public void UpdateTest(){
        BlogMapper mapper = MybatisUtils.getSqlSession().getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","测试11");
//        map.put("views",11);
        map.put("id",3);
        int num = mapper.updateBlog(map);
        System.out.println(num);
    }

    @Test
    public void SForeachTest(){
        BlogMapper mapper = MybatisUtils.getSqlSession().getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("5");
        map.put("ids",list);
        List<Blog> blogs = mapper.getBlogForeach(map);
        for (Blog blog:blogs)
            System.out.println(blog);
    }
}
