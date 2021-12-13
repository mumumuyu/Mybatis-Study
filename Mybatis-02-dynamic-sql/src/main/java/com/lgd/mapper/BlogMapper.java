package com.lgd.mapper;

import com.lgd.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    public int addBlog(Blog blogs);

    public List<Blog> getBlogIF(Map map);

    public List<Blog> getBlogChoose(Map map);

    public int updateBlog(Map map);

    public List<Blog> getBlogForeach(Map map);
}
