package com.mzy.dao;

import com.mzy.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    User findUserByCondition(Map<String, Object> map);

    List<User> findUserAll();

}
