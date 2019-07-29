package com.gxj.dao;

import com.gxj.model.User;
import org.apache.ibatis.annotations.Param;
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

    int delete(int id);

    int deleteByName(String name);

    List<User> findByNameAndPassword(@Param("name") String name,@Param("password") String password);
}
