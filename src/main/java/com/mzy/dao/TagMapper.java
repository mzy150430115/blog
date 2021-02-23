package com.mzy.dao;

import com.mzy.entity.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TagMapper {

    int insertTag(Tag tag);

    List<Tag> findTagByCondition(Map<String, Object> map);

    int updateTag(Tag tag);

    List<Tag> findTagAll();

}
