package com.example.jpetstore.test;

import com.example.jpetstore.dao.MypageDao;
import com.example.jpetstore.dao.mybatis.MybatisMypageDao;
import com.example.jpetstore.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class) //Unit 프레임워크에게 사용할 테스트 러너(runner)를 지정하는 데 사용
@ContextConfiguration(locations = "file:src/main/resources/dataAccessContext-mybatis.xml")
//테스트 실행에 필요한 애플리케이션 컨텍스트를 구성하는 방법을 지정
//이렇게 설정된 테스트 클래스는 스프링 애플리케이션 컨텍스트를 로드하고, dataAccessContext-mybatis.xml 파일에서 정의된 빈들을 테스트에서 사용할 수 있게 됨.

public class MypageTest {

    @Autowired
    private MypageDao mypageDao;
    @Autowired
    private MybatisMypageDao mybatisMypageDao;

    @Test
    public void testUser() throws IOException {


        // 사용자 조회
        User user = mybatisMypageDao.getUserById(2L); // 예시: ID가 2인 사용자를 가져오는 메서드

        // 사용자가 null인지 확인
        assertNotNull(user);
        System.out.println("이전 유저 닉네임:" + user.getId() + user.getNickname());
        // 사용자의 닉네임 변경
        mybatisMypageDao.updateNickname(user.getId(), "신뇽");

        User user1 = mybatisMypageDao.getUserById(2L); // 콘솔에 출력하려면 새로 객체를 다시 만들어줘야함!!

        // 변경된 닉네임 출력
        System.out.println("변경된 유저닉네임:" + user1.getNickname());


    }

    @Test
    public void testPassword() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //현재 비밀번호 확인은 컨트롤러나 프론트에서 처리해줘도 될 듯
        //현재 비밀번호 확인 및 변경

        User user3 = mybatisMypageDao.getUserById(2L);

        assertNotNull(user3);
        System.out.println("이전 유저 아이디:" + user3.getId() + "이전 비밀번호:" + user3.getPassword());

//        System.out.println("현재 비밀번호를 입력하세요: ");
//        String currentPassword = br.readLine();

//        if (user3.getPassword() == currentPassword) {
//            System.out.println("새로운 비밀번호를 입력하세요: ");
//            String newPassword = br.readLine();
//
//            mybatisMypageDao.changePassword(user3.getId(), newPassword);
//        } else {
//            System.out.println("비밀번호가 일치하지 않습니다.");
//        }
        mybatisMypageDao.changePassword(user3.getId(), "새비밀번호");

        User user4 = mybatisMypageDao.getUserById(2L);
        System.out.println("변경된 비밀번호:" + user4.getPassword());
    }
}
