package com.gxj.controller.test;

import com.gxj.dao.UserDao;
import com.gxj.model.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UserDaoTest extends BaseJunit4Test {
    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll(){
        List<User> userList = userDao.findAll();
        System.out.println(userList);;
    }
}
