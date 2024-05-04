package com.example.jpetstore.test;


import com.example.jpetstore.dao.UserDao;
import com.example.jpetstore.dao.mybatis.MybatisUserDao;
import com.example.jpetstore.domain.Movie;
import com.example.jpetstore.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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

        mybatisUserDao.updatePassword(user.getId(),"newPass");

        User user1 = userDao.getUserById(3L);

        System.out.println("변경된 유저비번:"+ user1.getPassword());

        //비번 확인
        String check = "newPass";
        if (check.equals(user1.getPassword()))
            System.out.println("맞았다!");
        else
            System.out.println("틀렸다!");

        //사용자 찾기
        User user2 =  mybatisUserDao.findUser("kim", "mimi");
        if (user2 != null) {
            System.out.println("찾은 유저 아이디:" + user2.getUser_id());
        } else {
            System.out.println("사용자를 찾을 수 없습니다.");
        }

        //사용자 닉제임 수정
        User user3 = userDao.getUserById(3L);
        mybatisUserDao.updateNickname(user.getId(), "dydy");
        User user4 = userDao.getUserById(3L);
        System.out.println("변경된 유저닉네임:"+ user4.getNickname());

        //
        User user5 = mybatisUserDao.existingNickname("dydy");
        if(user5 != null) {
            System.out.println("사용 중인 닉네임입니다");
        }else {
            System.out.println("사용 가능한 닉네임입니다");
        }

//        User user6 = userDao.getUserById(61L);
//        mybatisUserDao.deleteUser(user6.getId());

        List<User> allUser = mybatisUserDao.findAllUser();
        for (User user7 : allUser) {
            System.out.println("ID: " + user7.getId());
            System.out.println("USERID: " + user7.getUser_id());
            System.out.println("NICKNAME: " + user7.getNickname());
            System.out.println("PASSWORD: " + user7.getPassword());
            System.out.println("HINT: " + user7.getHint());
            System.out.println("--------------------------");
        }
    }

}