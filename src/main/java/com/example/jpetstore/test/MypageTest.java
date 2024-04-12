package com.example.jpetstore.test;


import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;
import com.example.jpetstore.service.MypageService;

public class MypageTest {

    public void testUpdateNickname() {
        // 가짜 MyPageMapper 객체 생성
        MyPageMapper fakeMyPageMapper = new FakeMyPageMapper();

        // MypageService 객체 생성
        MypageService mypageService = new MypageService(fakeMyPageMapper);

        // 테스트에 사용할 데이터
        String userId = "HMY";
        String newNickname = "MMM";

        // 서비스 메소드 호출
        int result = mypageService.updateNickname(userId, newNickname);

        // 결과 확인
        if (result == 1) {
            System.out.println("Nickname updated successfully.");
        } else {
            System.out.println("Failed to update nickname.");
        }
    }

    // 가짜 MyPageMapper 클래스 정의
    private static class FakeMyPageMapper implements MyPageMapper {
        @Override
        public int updateUserNickname(String userId, String newNickname) {
            // 실제로는 데이터베이스에 접근하지 않고 항상 성공적으로 업데이트되었다고 가정
            return 1;
        }
    }
}
