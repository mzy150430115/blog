package com.mzy.dao;

import com.mzy.entity.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BlogMapper {

    List<Blog> findBlogByCondition(Map<String, Object> map);

    int insertBlog(Blog blog);

    int updateBlog(Blog blog);

    List<Blog> findBlogAll();
}
