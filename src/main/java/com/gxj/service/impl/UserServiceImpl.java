package com.gxj.service.impl;

import com.gxj.dao.UserDao;
import com.gxj.model.User;
import com.gxj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    public List<User> findAll(){
        return userDao.findAll();
    }
}
