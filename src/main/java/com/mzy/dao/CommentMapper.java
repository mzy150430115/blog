package com.mzy.dao;

import com.mzy.entity.Comment;
import com.mzy.entity.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommentMapper {



    int insertComment(Comment comment);

    List<Comment> findCommentByCondition(Map<String, Object> map);

    int updateComment(Comment comment);

    List<Comment> findCommentAll();
}
