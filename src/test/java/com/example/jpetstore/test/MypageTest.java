package com.example.jpetstore.test;

import com.example.jpetstore.dao.MypageDao;
import com.example.jpetstore.dao.mybatis.MybatisMypageDao;
import com.example.jpetstore.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class) //Unit 프레임워크에게 사용할 테스트 러너(runner)를 지정하는 데 사용
@ContextConfiguration(locations = "file:src/main/resources/dataAccessContext-mybatis.xml")  //테스트 실행에 필요한 애플리케이션 컨텍스트를 구성하는 방법을 지정
//이렇게 설정된 테스트 클래스는 스프링 애플리케이션 컨텍스트를 로드하고, dataAccessContext-mybatis.xml 파일에서 정의된 빈들을 테스트에서 사용할 수 있게 됨.

public class MypageTest {

    @Autowired
    private MypageDao mypageDao;
    @Autowired
    private MybatisMypageDao mybatisMypageDao;

    @Test
    public void testUser() throws Exception{

        // 사용자 조회
        User user = mypageDao.getUserById(2L); // 예시: ID가 2인 사용자를 가져오는 메서드

        // 사용자가 null인지 확인
        assertNotNull(user);
        System.out.println("이전 유저 닉네임:"+ user.getId()+user.getUser_id() +user.getNickname());
        // 사용자의 닉네임 변경
        mybatisMypageDao.updateNickname(user.getUser_id(),"신뇽");

        User user1 = mypageDao.getUserById(2L); // 콘솔에 출력하려면 새로 객체를 다시 만들어줘야함!!

        // 변경된 닉네임 출력
        System.out.println("변경된 유저닉네임:"+ user1.getNickname());
    }

}
