package com.example.jpetstore.test;


import com.example.jpetstore.dao.UserDao;
import com.example.jpetstore.dao.mybatis.MybatisUserDao;
import com.example.jpetstore.domain.Interest;
import com.example.jpetstore.domain.Movie;
import com.example.jpetstore.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        //사용자 닉네임 수정
        User user3 = userDao.getUserById(3L);
        mybatisUserDao.updateNickname(user.getId(), "dydy");
        User user4 = userDao.getUserById(3L);
        System.out.println("변경된 유저닉네임:"+ user4.getNickname());

        //중복 닉네임 체크
        User user5 = mybatisUserDao.existingNickname("dydy");
        if(user5 != null) {
            System.out.println("사용 중인 닉네임입니다");
        }else {
            System.out.println("사용 가능한 닉네임입니다");
        }

        //사용자 삭제
//        User user6 = userDao.getUserById(61L);
//        mybatisUserDao.deleteUser(user6.getId());

        //사용자 전체 출력
        List<User> allUser = mybatisUserDao.findAllUser();
        for (User user7 : allUser) {
            System.out.println("ID: " + user7.getId());
            System.out.println("USERID: " + user7.getUser_id());
            System.out.println("NICKNAME: " + user7.getNickname());
            System.out.println("PASSWORD: " + user7.getPassword());
            System.out.println("HINT: " + user7.getHint());

            System.out.println("--------------------------");
        }

        //사용자의 관심사 찾기
        Interest interests = userDao.findInterest(3L);
        System.out.println("관심사:"+ interests.getGenre());

        //관심사 수정
//        List<String> genre = new ArrayList<>(); // 예시 관심사
//        genre.add("1");
//        genre.add("2");
//        System.out.println(genre);
//        userDao.updateInterest(3L, genre.toString());

        //사용자 추가
//        User user9 = new User();
//        user9.setUser_id("안녕22");
//        user9.setPassword("hello22");
//        user9.setHint("하이22");
//        user9.setNickname("hi22");
//        userDao.addUser(user9);
//
//        List<String> genre = new ArrayList<>(); // 예시 관심사
//        genre.add("1");
//        genre.add("3");
//        System.out.println(genre);
//
//        Interest interest = new Interest();
//        interest.setId(user9.getId());
//        interest.setGenre(genre.toString());
//        userDao.addInterest(interest); //관심사도 추가

        //사용자 취향까지 출력
        User user10 = mybatisUserDao.findAllUserInterest(3L);
        System.out.println("--------------------------");
        System.out.println("ID: " + user10.getId());
        System.out.println("USERID: " + user10.getUser_id());
        System.out.println("NICKNAME: " + user10.getNickname());
        System.out.println("PASSWORD: " + user10.getPassword());
        System.out.println("HINT: " + user10.getHint());
        System.out.println("INTEREST: " + user10.getGenre());
        System.out.println("--------------------------");
    }

}