package com.gxj.dao;

import com.gxj.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> findAll();

    User findById(String id);

    User findByName(String name);

    int countByName(String name);

    int insert(User user);

    int update(User user);
}
