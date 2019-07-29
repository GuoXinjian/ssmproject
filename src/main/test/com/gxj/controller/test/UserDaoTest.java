package com.gxj.controller.test;

import com.gxj.dao.UserDao;
import com.gxj.model.User;
import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

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

    @Test
    public void testFindById(){
        User user = userDao.findById("1");
        System.out.println(user);
    }

    @Test
    public void testFindByName(){
        User user = userDao.findByName("aaa");
        System.out.println(user);
    }

    @Test
    public void testCountByName(){
        int count = userDao.countByName("aaa");
        System.out.println(count);
    }

    @Test
    public void testInsert(){
        User user = new User();
//        user.setId(3);
        user.setName("ccc");
        user.setPassword("123456");
        int count = userDao.insert(user);
        System.out.println(count);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(3);
        user.setName("fabadfaadf");
        user.setPassword("fadbadfasdf");
        int res = userDao.update(user);
        System.out.println(res);
    }

    @Test
    public  void testDelete(){
        int id = 4;
        int res = userDao.delete((id));
        System.out.println(res);
    }

    @Test
    public void testDeleteByName(){
        String name = "ccc";
        int res = userDao.deleteByName(name);
        System.out.println(res);
    }
}
