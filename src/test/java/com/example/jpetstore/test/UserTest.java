package com.example.jpetstore.test;


import com.example.jpetstore.dao.UserDao;
import com.example.jpetstore.dao.mybatis.MybatisUserDao;
import com.example.jpetstore.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/dataAccessContext-mybatis.xml")
public class UserTest {

    @Autowired
    private UserDao userDao;
    @Autowired
    private MybatisUserDao mybatisUserDao;


    @Test
    public void testUser() throws Exception{

        User user = userDao.getUserById(3L);

        assertNotNull(user);
        System.out.println("유저 현재 비번:"+ user.getId()+ user.getPassword());

        mybatisUserDao.updatePassword(user.getUser_id(),"Pass");

        User user1 = userDao.getUserById(3L);

        System.out.println("변경된 유저비번:"+ user1.getPassword());
    }

}